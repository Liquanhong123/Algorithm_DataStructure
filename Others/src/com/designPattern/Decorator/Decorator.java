package com.designPattern.Decorator;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/13/2018 3:49 PM
 */
public class Decorator implements Sourceable {
    private Sourceable source;
    //構造
    public Decorator(Sourceable source) {
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}
