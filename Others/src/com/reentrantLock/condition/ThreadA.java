package com.reentrantLock.condition;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/14/2018 7:21 PM
 */
public class ThreadA extends  Thread {
        private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.await();
    }
}
