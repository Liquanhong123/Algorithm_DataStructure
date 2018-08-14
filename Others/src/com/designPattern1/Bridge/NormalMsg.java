package com.designPattern1.Bridge;

/**
 * @Description:
 * @Author:Lixiaohong_666
 * @Date:Created in 16:53 2018/2/2
 */
public class NormalMsg extends Msg {
    public NormalMsg(SendMsgInterface sendMsgInterface) {
        super(sendMsgInterface);
    }

    @Override
    public void send() {
        System.out.println("普通信息");
    }
}
