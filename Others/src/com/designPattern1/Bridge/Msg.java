package com.designPattern1.Bridge;

/**
 * @Description:信息类型的抽象类
 * @Author:Lixiaohong_666
 * @Date:Created in 16:48 2018/2/2
 */
abstract class Msg {
    private SendMsgInterface sendMsgInterface;

    public Msg(SendMsgInterface sendMsgInterface) {
        this.sendMsgInterface = sendMsgInterface;
    }

    public abstract void send();
}
