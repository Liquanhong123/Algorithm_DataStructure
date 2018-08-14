package com.reentrantLock.condition2;

/**
 * @Description：實現生產者/消費者模式：一對一交替打印★☆
 * @Author： thtrt
 * @Createdate： 1/14/2018 8:00 PM
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA A = new ThreadA(myService);
        A.start();
        ThreadB B = new ThreadB(myService);
        B.start();
    }
}
