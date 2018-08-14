package com.designPattern.adapter;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/13/2018 12:57 PM
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
