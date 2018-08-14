package com.designPattern1.Bridge;

/**
 * @Description:Emil发送方式类
 * @Author:Lixiaohong_666
 * @Date:Created in 16:50 2018/2/2
 */
public class EmailSendMsg implements SendMsgInterface{

    @Override
    public void sendMsg() {
        System.out.println("Email 方式发送");
    }
}
