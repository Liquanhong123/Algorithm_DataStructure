package com.designPattern.abstractFactory;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/12/2018 5:37 PM
 */
public class SendSmsFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
