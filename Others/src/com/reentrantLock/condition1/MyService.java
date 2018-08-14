package com.reentrantLock.condition1;

import com.reentrantLock.condition.ThreadA;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description：使用多個Condition實現通知部分線程
 * @Author： thtrt
 * @Createdate： 1/14/2018 7:29 PM
 */
public class MyService {
        private Lock lock = new ReentrantLock();
        private Condition conditionA = lock.newCondition();
        private Condition conditionB = lock.newCondition();

        public void awaitA(){
            lock.lock();
            System.out.println("begin awaitA時間爲"+System.currentTimeMillis()+"ThreadName="+Thread.currentThread().getName());
            try {
                conditionA.await();
                System.out.println("end awaitA時間爲"+System.currentTimeMillis()+"ThreadName="+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
        public void awaitB(){
            lock.lock();
            System.out.println("begin awaitB"+System.currentTimeMillis()+"ThreadName="+Thread.currentThread().getName());
            try {
                conditionA.await();
                System.out.println("end awaitB時間爲"+System.currentTimeMillis()+"ThreadName="+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
        public void sinalAll_A(){
            try {
                lock.lock();
                System.out.println("signalAll_A時間爲"+System.currentTimeMillis()+"ThreadName="+ Thread.currentThread().getName());
                conditionA.signalAll();
            }finally {
                lock.unlock();
            }
        }
        public void sinalAll_B(){
            try {
                lock.lock();
                System.out.println("signalAll_B時間爲"+System.currentTimeMillis()+"ThreadName="+ Thread.currentThread().getName());
                conditionB.signalAll();
            }finally {
                lock.unlock();
            }
        }
}
