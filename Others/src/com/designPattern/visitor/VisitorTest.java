package com.designPattern.visitor;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/18/2018 3:58 PM
 */
public class VisitorTest {
    public static void main(String[] args) {
        Visitor visitor = new MyVisit();
        Subject subject = new MySubject();
        subject.accept(visitor);
    }
}
