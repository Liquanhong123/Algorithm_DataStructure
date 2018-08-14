package com.designPattern1.Builder;

/**
 * @Description:房子類
 * @Author:Lixiaohong_666
 * @Date:Created in 3:26 PM 1/30/2018
 */
public class Room {
    private Window window;
    private Floor floor;

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }
}
