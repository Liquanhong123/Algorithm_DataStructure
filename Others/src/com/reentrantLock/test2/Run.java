package com.reentrantLock.test2;

/**
 * @Description：此實驗說明，調用Lock().lock的線程就持有了“對象監視器”，其他線程只有等待鎖被釋放時才能再次爭搶
 * 線程之間的執行次序也是隨機的
 * @Author： thtrt
 * @Createdate： 1/14/2018 4:29 PM
 */
public class Run {
    public static void main(String[] args) {
        Myservice myservice = new Myservice();
        ThreadA a = new ThreadA(myservice);
        a.setName("A");
        a.start();
        ThreadAA aa = new ThreadAA(myservice);
        aa.setName("AA");
        aa.start();
        ThreadB b = new ThreadB(myservice);
        b.setName("B");
        b.start();
        ThreadBB bb = new ThreadBB(myservice);
        bb.setName("bb");
        bb.start();
    }
}
