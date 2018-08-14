package com.reentrantLock.condition1;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/14/2018 7:41 PM
 */
public class ThreadB extends Thread {
    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.awaitB();
    }
}
