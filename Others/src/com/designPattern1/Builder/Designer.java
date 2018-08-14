package com.designPattern1.Builder;

/**
 * @Description:房子設計師
 * @Author:Lixiaohong_666
 * @Date:Created in 3:43 PM 1/30/2018
 */
public class Designer {
    public void command(Builder builder){
        //先建造地板
        builder.makeFloor();
        //再建造窗戶
        builder.makeWindow();
    }
}
