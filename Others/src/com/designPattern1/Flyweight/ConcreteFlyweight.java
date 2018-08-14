package com.designPattern1.Flyweight;

/**
 * @Description:具体的享元类
 * @Author:Lixiaohong_666
 * @Date:Created in 17:22 2018/2/2
 */
public class ConcreteFlyweight implements Flyweight {
    //內蓄狀態
    private String innerState;
    //外蓄狀態
    private String exState;

    public ConcreteFlyweight(String innerState) {
        this.innerState = innerState;
    }
    @Override
    public void changeStat(String exState) {
        this.exState = exState;
    }
}
