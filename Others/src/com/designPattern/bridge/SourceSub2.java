package com.designPattern.bridge;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/15/2018 11:17 AM
 */
public class SourceSub2 implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is my second sub!");
    }
}
