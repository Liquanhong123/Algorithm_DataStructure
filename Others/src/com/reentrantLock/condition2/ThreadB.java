package com.reentrantLock.condition2;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/14/2018 7:59 PM
 */
public class ThreadB extends  Thread {
    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        for(int i=0;i<20;i++)
        myService.get();
    }
}
