package com.designPattern.abstractFactory;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/12/2018 5:38 PM
 */
public class Test {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}
