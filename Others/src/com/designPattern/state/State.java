package com.designPattern.state;

/**
 * @Description：狀態模式：当对象的状态改变时，同时改变其行为
 * 比如qq中有在線、隱身、忙碌等狀態,每個狀態對應不同的操作。就兩點：可以通过改变状态来获得不同的行为。2、你的好友能同时看到你的变化
 * @Author： thtrt
 * @Createdate： 1/18/2018 3:40 PM
 */
//状态类
public class State {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1(){
        System.out.println("execute the first opt!");
    }
    public void method2(){
        System.out.println("execute the second opt!");
    }
}
