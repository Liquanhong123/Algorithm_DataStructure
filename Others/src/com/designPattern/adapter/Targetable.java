package com.designPattern.adapter;

/**
 * @Description：接口(用於類設配器和對象設配器)
 * @Author： thtrt
 * @Createdate： 1/13/2018 12:56 PM
 */
public interface Targetable {
    //與原類的方法相同
    public void method1();
    //新類的方法
    public void method2();

}
