package com.designPattern1.Bridge;

/**
 * @Description:Sms方式发送类
 * @Author:Lixiaohong_666
 * @Date:Created in 16:51 2018/2/2
 */
public class SmsSendMsg implements SendMsgInterface {

    @Override
    public void sendMsg() {
        System.out.println("Sms 方式发送");
    }
}
