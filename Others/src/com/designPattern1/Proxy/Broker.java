package com.designPattern1.Proxy;

/**
 * @Description:明星經紀人
 * @Author:Lixiaohong_666
 * @Date:Created in 5:16 PM 1/31/2018
 */
public class Broker implements Schedule {
    private Schedule star;

    public Broker() {
        star = new Star();
    }

    public Broker(Schedule star) {
        this.star = star;
    }

    @Override
    public void weiTalk() {
        System.out.println("陪着明星參加微訪談");
        star.weiTalk();
    }

    @Override
    public void donation() {
        System.out.println("陪着明星捐款");
        star.donation();
    }
}
