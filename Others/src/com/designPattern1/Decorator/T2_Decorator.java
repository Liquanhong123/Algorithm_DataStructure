package com.designPattern1.Decorator;

/**
 * @Description:第二代(裝飾者模式)
 * @Author:Lixiaohong_666
 * @Date:Created in 5:07 PM 1/31/2018
 */
public class T2_Decorator implements Phone {
    private Phone phone;

    public T2_Decorator(Phone phone) {
        this.phone = phone;
    }
    public void installApk(){
        System.out.println("可以安裝Android軟件了");
    }
    public void supportDx(){
        System.out.println("可以支持電信用戶了");
    }
    @Override
    public void tel() {
        phone.tel();
    }

    @Override
    public void sms() {
        phone.sms();
    }
}
