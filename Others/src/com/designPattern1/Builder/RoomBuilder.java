package com.designPattern1.Builder;

/**
 * @Description:工人,用於完成房屋構造過程中每個具體步驟
 * @Author:Lixiaohong_666
 * @Date:Created in 3:37 PM 1/30/2018
 */
public class RoomBuilder implements Builder{
    private Room room = new Room();
    @Override
    public void makeWindow() {
        room.setWindow(new Window());
    }

    @Override
    public void makeFloor() {
        room.setFloor(new Floor());
    }

    @Override
    public Room getRoom() {
        return room;
    }
}
