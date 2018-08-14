package com.reentrantLock.test1;

/**
 * @Description：從程序的運行結果來看。當前線程打印完畢後將鎖釋放，其他線程才可以繼續打印。
 * 線程打印的數據是分組打印，因爲當前線程已經持有鎖，但線程間的打印順序是隨機的
 * @Author： thtrt
 * @Createdate： 1/14/2018 4:14 PM
 */
public class Run {
    public static void main(String[] args) {
            MyService myService = new MyService();
            MyThread thread1 = new MyThread(myService);
            MyThread thread2 = new MyThread(myService);
            MyThread thread3 = new MyThread(myService);
            MyThread thread4 = new MyThread(myService);
            MyThread thread5 = new MyThread(myService);

            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();
    }
}
