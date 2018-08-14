package com.designPattern.Facade;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/13/2018 10:32 PM
 */
public class FacadeTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
