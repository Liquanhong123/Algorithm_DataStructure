package com.reentrantLock.test2;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/14/2018 4:27 PM
 */
public class ThreadA extends Thread {
    private Myservice myservice;

    public ThreadA(Myservice myservice) {
        this.myservice = myservice;
    }

    @Override
    public void run() {
        myservice.methodA();
    }
}
