package com.rentrantReadWriteLock;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/14/2018 8:15 PM
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}
