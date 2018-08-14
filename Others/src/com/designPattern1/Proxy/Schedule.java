package com.designPattern1.Proxy;

/**
 * @Description:日程接口：微訪談、捐獻
 * 装饰器模式主要用来替代继承，为的是给一个现有的类增加新的功能，客户端关心的是装饰后的类所具有的功能；而代理模式为的是对被代理对象提供访问控制，客户端关心的实际上还是被代理对象所具有的功能。
 * @Author:Lixiaohong_666
 * @Date:Created in 5:14 PM 1/31/2018
 */
public interface Schedule {
    void weiTalk();
    void donation();
}
