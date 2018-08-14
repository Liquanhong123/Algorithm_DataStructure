package com.designPattern.abstractFactory;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/12/2018 5:34 PM
 */
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
