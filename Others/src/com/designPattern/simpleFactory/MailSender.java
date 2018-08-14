package com.designPattern.simpleFactory;

public class MailSender implements  Sender {
    @Override
    public void Send() {
        System.out.println("this is mailSender!");
    }
}
