package com.designPattern1.Facade;

/**
 * @Description:
 * @Author:Lixiaohong_666
 * @Date:Created in 21:12 2018/1/31
 */
public class SaicOffice implements Executive {
    @Override
    public void approve() {
        System.out.println("工商局審批通過");
    }
}
