package com.designPattern.simpleFactory;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/12/2018 5:19 PM
 */
public class SendFactory {
    public Sender produce(String type) {
        if ("mail".equals(type))
            return new MailSender();
         else if("sms".equals(type))
             return new SmsSender();
         else{
            System.out.println("請輸入正確的類型!");
            return null;
        }
    }
}
