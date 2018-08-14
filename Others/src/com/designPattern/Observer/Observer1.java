package com.designPattern.Observer;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/16/2018 10:19 PM
 */
public class Observer1 implements Observer {

    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}
