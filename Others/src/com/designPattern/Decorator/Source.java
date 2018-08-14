package com.designPattern.Decorator;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/13/2018 3:49 PM
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
