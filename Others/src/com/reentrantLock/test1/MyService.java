package com.reentrantLock.test1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/14/2018 4:08 PM
 */
public class MyService {
     private Lock lock = new ReentrantLock();

     public void testMethod(){
         lock.lock();
         for(int i=0;i<5;i++){
             System.out.println("ThreadName="+Thread.currentThread().getName()+" "+(i+1));
         }
         lock.unlock();
     }
}
