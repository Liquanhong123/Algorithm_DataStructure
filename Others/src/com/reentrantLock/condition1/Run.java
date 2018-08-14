package com.reentrantLock.condition1;

/**
 * @Description：通過實驗可知，使用ReentrantLock對象可以喚醒指定種類的線程，這是控制部分線程行爲的方便方式
 * @Author： thtrt
 * @Createdate： 1/14/2018 7:42 PM
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA A = new ThreadA(myService);
        A.setName("A");
        A.start();
        ThreadB B = new ThreadB(myService);
        B.setName("B");
        B.start();
        Thread.sleep(3000);
        myService.sinalAll_A();
    }
}
