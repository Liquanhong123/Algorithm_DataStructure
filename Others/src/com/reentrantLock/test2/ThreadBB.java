package com.reentrantLock.test2;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/14/2018 4:27 PM
 */
public class ThreadBB extends Thread {
    private Myservice myservice;

    public ThreadBB(Myservice myservice) {
        this.myservice = myservice;
    }

    @Override
    public void run() {
        myservice.methodB();
    }
}
