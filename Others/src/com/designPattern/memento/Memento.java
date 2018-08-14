package com.designPattern.memento;

/**
 * @Description：备忘录类
 * @Author： thtrt
 * @Createdate： 1/18/2018 11:15 AM
 */
public class Memento {
    private String value;
    //構造
    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
