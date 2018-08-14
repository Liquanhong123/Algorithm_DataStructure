package com.designPattern.memento;

/**
 * @Description：存储备忘录的类
 * @Author： thtrt
 * @Createdate： 1/18/2018 11:20 AM
 */
public class Storage {
    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
