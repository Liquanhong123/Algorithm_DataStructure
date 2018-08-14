package com.designPattern1.Bridge;

/**
 * @Description:
 * @Author:Lixiaohong_666
 * @Date:Created in 16:54 2018/2/2
 */
public class BridgeTest {
    public static void main(String[] args) {
        //以手機短信發送緊急信息
        SendMsgInterface sendMsgInterface = new SmsSendMsg();
        Msg msg = new ImportantMsg(sendMsgInterface);
        msg.send();
    }
}
