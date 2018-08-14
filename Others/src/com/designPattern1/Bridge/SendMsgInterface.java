package com.designPattern1.Bridge;

/**
 * @Description:发信息接口
 * 桥接模式是指：将抽象和行为划分开来，从而将各个可能变化的维度分离开来，各自独立成一个类，但是能够动态的组合
 * @Author:Lixiaohong_666
 * @Date:Created in 16:47 2018/2/2
 */
public interface SendMsgInterface {
    void sendMsg();
}
