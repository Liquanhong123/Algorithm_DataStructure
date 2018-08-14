package com.rentrantReadWriteLock;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/14/2018 8:15 PM
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}
