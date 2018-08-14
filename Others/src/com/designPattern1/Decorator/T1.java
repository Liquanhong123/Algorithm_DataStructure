package com.designPattern1.Decorator;

/**
 * @Description:第一代
 * @Author:Lixiaohong_666
 * @Date:Created in 4:59 PM 1/31/2018
 */
public class T1 implements Phone {
    @Override
    public void tel() {
        System.out.println("可以實現基本的接打電話");
    }

    @Override
    public void sms() {
        System.out.println("可以實現基本的收發短信功能");
    }
}
