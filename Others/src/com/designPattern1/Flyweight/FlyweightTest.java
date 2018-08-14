package com.designPattern1.Flyweight;

/**
 * @Description:
 * @Author:Lixiaohong_666
 * @Date:Created in 17:42 2018/2/2
 */
public class FlyweightTest {
    public static void main(String[] args) {
        Flyweight a = FlyweightFactory.getFlyweight("A");
        a.changeStat("first-A");
        Flyweight b = FlyweightFactory.getFlyweight("B");
        a.changeStat("first-B");

        Flyweight aa = FlyweightFactory.getFlyweight("A");

        a.changeStat("second-A");
        Flyweight bb = FlyweightFactory.getFlyweight("B");
        b.changeStat("second-B");

        System.out.println(a == aa);  // true
        System.out.println(b == bb);  // true
    }
}
