package com.designPattern.chainOfResponsibility;

/**
 * @Description：MyHandle类是核心，实例化后生成一系列相互持有的对象，构成一条链
 * @Author： thtrt
 * @Createdate： 1/18/2018 10:43 AM
 */
public class MyHandler extends  AbstractHandler implements Handler {
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println(name+"deal!");
        if(getHandler()!=null)
            getHandler().operation();
    }
}
