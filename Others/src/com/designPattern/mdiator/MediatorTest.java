package com.designPattern.mdiator;

/**
 * @Description：中介者模式測試類
 * @Author： thtrt
 * @Createdate： 1/20/2018 9:58 AM
 */
public class MediatorTest {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
