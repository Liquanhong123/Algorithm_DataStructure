package com.designPattern.command;

/**
 * @Description：被调用者（士兵）
 * @Author： thtrt
 * @Createdate： 1/18/2018 11:06 AM
 */
public class Receiver {
    public void action(){
        System.out.println("command received!");
    }
}
