package com.reentrantLock.test1;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/14/2018 4:11 PM
 */
public class MyThread extends  Thread {
    private MyService service;

    public MyThread(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
