package com.designPattern.bridge;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/15/2018 11:20 AM
 */
public class MyBridge extends Bridge  {
    public void method(){
        getSourceable().method();
    }
}
