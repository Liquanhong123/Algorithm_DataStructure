package com.designPattern.abstractFactory;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/12/2018 5:36 PM
 */
public class SendMailFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
