package com.designPattern1.Bridge;

/**
 * @Description:紧急信息
 * @Author:Lixiaohong_666
 * @Date:Created in 16:51 2018/2/2
 */
public class ImportantMsg extends Msg {
    public ImportantMsg(SendMsgInterface sendMsgInterface) {
        super(sendMsgInterface);
    }
    @Override
    public void send() {
        System.out.println("緊急信息");
    }
}
