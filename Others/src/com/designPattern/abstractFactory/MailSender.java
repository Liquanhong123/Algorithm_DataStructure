package com.designPattern.abstractFactory;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/12/2018 5:33 PM
 */
public class MailSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}
