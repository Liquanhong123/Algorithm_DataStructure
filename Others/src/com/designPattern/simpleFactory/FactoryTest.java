package com.designPattern.simpleFactory;

/**
 * @Description：測試類
 * @Author： thtrt
 * @Createdate： 1/12/2018 5:22 PM
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();
    }
}
