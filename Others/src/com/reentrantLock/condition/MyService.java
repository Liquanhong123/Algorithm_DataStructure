package com.reentrantLock.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/14/2018 7:14 PM
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await(){
        lock.lock();
        System.out.println("await時間爲"+System.currentTimeMillis());
        try {
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void signal(){

        try {
            lock.lock();
            System.out.println("sinal時間爲"+System.currentTimeMillis());
            condition.signal();
        }finally {
            lock.unlock();
        }
    }
}
