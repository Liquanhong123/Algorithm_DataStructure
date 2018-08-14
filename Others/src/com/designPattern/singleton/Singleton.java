package com.designPattern.singleton;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/13/2018 9:38 AM
 */
public class Singleton {
    //私有靜態實例
    private static Singleton instance;
    //私有構造方法，防止被實例化
    private Singleton(){

    }
    //靜態工程方法，創建實例
    public static Singleton getInstance(){
        //同步
        if (instance == null) {
            synchronized (instance) {
                if (instance == null ){
                    instance = new Singleton();
                }
           }
        }
        return instance;

    }
    //該對象用於序列化，可以保證對象在前後一致
    public Object readResolve(){
        return instance;
    }
}
