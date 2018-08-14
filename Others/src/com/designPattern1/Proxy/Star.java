package com.designPattern1.Proxy;

/**
 * @Description:明星類
 * @Author:Lixiaohong_666
 * @Date:Created in 5:15 PM 1/31/2018
 */
public class Star implements Schedule {
    @Override
    public void weiTalk() {
        System.out.println("開始微訪談");
    }

    @Override
    public void donation() {
        System.out.println("開始捐款");
    }
}
