package com.designPattern.singleton;

/**
 * @Description：較完美的單列
 * @Author： thtrt
 * @Createdate： 1/13/2018 9:49 AM
 */
public class Singleton1 {
    //私有構造方法
    private Singleton1(){

    }
    //使用內部類來維護單例
    private static class SingletonFactory{
        private static Singleton1 instance = new Singleton1();
    }
    //獲取實例
    public static Singleton1 getInstance(){
        return SingletonFactory.instance;
    }
    //如果對象用於序列化，可以保證對象在序列化前後一致
    public Object readResolve(){
        return getInstance();
    }
}
