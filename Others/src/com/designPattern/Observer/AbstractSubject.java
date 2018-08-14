package com.designPattern.Observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/16/2018 10:23 PM
 */
public abstract class AbstractSubject implements Subject {
    private Vector<Observer> vector = new Vector<Observer>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumeration = vector.elements();
        while(enumeration.hasMoreElements())
            enumeration.nextElement().update();
    }

    @Override
    public void operation() {

    }
}
