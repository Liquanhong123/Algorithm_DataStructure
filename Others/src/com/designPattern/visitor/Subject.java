package com.designPattern.visitor;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/18/2018 3:54 PM
 */
public interface Subject {
    public void accept(Visitor visitor);
    public String getSubject();
}
