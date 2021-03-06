package com.designPattern.Observer;

/**
 * @Description：当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化！对象之间是一种一对多的关系
 * 這個案列中：MySubject类就是我们的主对象，Observer1和Observer2是依赖于MySubject的对象，当MySubject变化时，Observer1和Observer2必然变化。AbstractSubject类中定义着需要监控的对象列表，可以对其进行修改：增加或删除被监控对象，且当MySubject变化时，负责通知在列表内存在的对象
 * @Author： thtrt
 * @Createdate： 1/16/2018 10:19 PM
 */
public interface Observer {
    public void update();
}
