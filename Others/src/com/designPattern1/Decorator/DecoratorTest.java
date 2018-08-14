package com.designPattern1.Decorator;

/**
 * @Description:測試類
 * @Author:Lixiaohong_666
 * @Date:Created in 5:10 PM 1/31/2018
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Phone t1 = new T1();
        Phone t2_dec = new T2_Decorator(t1);
        t2_dec.tel();
        t2_dec.sms();
    }
}
