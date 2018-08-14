package com.rentrantReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Description：讀讀共享
 * @Author： thtrt
 * @Createdate： 1/14/2018 8:12 PM
 */
public class Service {
    private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

    public void read(){
        //這個是獲得寫鎖的，原理一樣不再演示
        //reentrantReadWriteLock.writeLock().lock();
        reentrantReadWriteLock.readLock().lock();
        System.out.println("獲得讀鎖："+Thread.currentThread().getName()+" "+System.currentTimeMillis());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }
}
