package com.designPattern.adapter;

/**
 * @Description：这样Targetable接口的实现类就具有了Source类的功能。
 * @Author： thtrt
 * @Createdate： 1/13/2018 12:58 PM
 */
public class Test {
    public static void main(String[] args) {
        /*
        類設配器測試
        Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();*/
        //對象適配器測試
        Source source = new Source();
        Targetable targetable = new Wrapper(source);
        targetable.method1();
        targetable.method2();
    }
}
