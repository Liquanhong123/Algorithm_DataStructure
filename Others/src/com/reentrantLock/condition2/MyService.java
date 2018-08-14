package com.reentrantLock.condition2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description：實現生產者/消費者模式：一對一交替打印★☆
 * @Author： thtrt
 * @Createdate： 1/14/2018 7:53 PM
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    public void set(){
        try {
            lock.lock();
            while (hasValue == true){
                condition.await();
            }
            System.out.println("打印★");
            hasValue = true;
            condition.signal();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void get(){
        try {
            lock.lock();
            while (hasValue == false){
                condition.await();
            }
            System.out.println("打印☆");
            hasValue = false;
            condition.signal();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
