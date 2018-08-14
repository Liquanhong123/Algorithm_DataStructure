package com.designPattern.visitor;

/**
 * @Description：一个Visitor类，存放要访问的对象
 * @Author： thtrt
 * @Createdate： 1/18/2018 3:53 PM
 */
public class MyVisit implements Visitor {

    @Override
    public void visit(Subject subject) {
        System.out.println("visit the subject："+subject.getSubject());
    }
}
