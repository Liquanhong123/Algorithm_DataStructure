package com.designPattern.Proxy;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/13/2018 10:13 PM
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method");
    }
}
