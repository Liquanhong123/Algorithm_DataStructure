package com.designPattern.Observer;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/16/2018 10:21 PM
 */
public interface Subject {
    //增加觀察者
    public void add(Observer observer);
    //刪除觀察者
    public void del(Observer observer);
    //通知所有的觀察者
    public void notifyObservers();
    //自身的操作
    public void operation();
}
