package com.designPattern.Observer;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/16/2018 10:27 PM
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new MySubject();
        subject.add(new Observer1());
        subject.add(new Observer2());

        subject.operation();
    }
}
