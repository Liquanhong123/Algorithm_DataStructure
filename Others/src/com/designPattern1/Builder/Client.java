package com.designPattern1.Builder;

/**
 * @Description:房主,房主請設計師和工人造房子
 * @Author:Lixiaohong_666
 * @Date:Created in 3:44 PM 1/30/2018
 */
public class Client {

    public static void main(String[] args) {
        //先找來一個工人
        Builder builder = new RoomBuilder();
        //再找來一個設計師
        Designer designer = new Designer();
        //工人按照設計師設計建造
        designer.command(builder);
        //工人向房主交房子
        Room newRoom = builder.getRoom();
    }
}
