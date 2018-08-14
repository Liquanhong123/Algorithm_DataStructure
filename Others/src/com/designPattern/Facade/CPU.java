package com.designPattern.Facade;

/**
 * @Description：外观模式：为了解决类与类之家的依赖关系的
 * @Author： thtrt
 * @Createdate： 1/13/2018 10:22 PM
 */
public class CPU {
    public void startup(){
        System.out.println("cpu startup!");
    }
    public void shutdown(){
        System.out.println("cpu shutdown!");
    }
}
