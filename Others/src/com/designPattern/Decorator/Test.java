package com.designPattern.Decorator;

/**
 * @Description：装饰器模式的应用场景：1、需要扩展一个类的功能 2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
 * @Author： thtrt
 * @Createdate： 1/13/2018 3:52 PM
 */
public class Test {
    public static void main(String[] args) {
        Sourceable sourceable = new Source();
        Sourceable obj = new Decorator(sourceable);
        obj.method();
    }
}
