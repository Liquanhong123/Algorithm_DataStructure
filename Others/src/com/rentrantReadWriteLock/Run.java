package com.rentrantReadWriteLock;

/**
 * @Description：兩個線程幾乎同時進入Lock()方法後面的代碼。說明使用lock.readLock()讀鎖可以提高程序效率,允許多個線程同時執行Lock()方法後面的代碼
 * @Author： thtrt
 * @Createdate： 1/14/2018 8:16 PM
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA A = new ThreadA(service);
        A.setName("A");
        ThreadB B = new ThreadB(service);
        B.setName("B");
        A.start();
        B.start();
    }
}
