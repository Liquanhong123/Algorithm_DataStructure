package com.designPattern.Observer;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/16/2018 10:26 PM
 */
public class MySubject extends  AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
