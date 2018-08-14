package com.designPattern.Proxy;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/13/2018 10:14 PM
 */
public class Proxy implements  Sourceable {
    private Source source;
    public Proxy(){
        this.source = new Source();
    }
    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void before() {
        System.out.println("before proxy!");
    }
    private void after(){
        System.out.println("after proxy!");
    }

}
