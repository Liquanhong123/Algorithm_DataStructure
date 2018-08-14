package com.reentrantLock.condition;

/**
 * @Description：成功實現了等待/通知模式
 * Object中的wait()相當於Condition中的awit()
 * Object中的notify（）、notifyAll()相當於Condition中的signal()、sinalAll()
 * @Author： thtrt
 * @Createdate： 1/14/2018 7:22 PM
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.start();
        ThreadA.sleep(3000);
        myService.signal();
    }
}
