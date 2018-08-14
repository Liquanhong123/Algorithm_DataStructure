package com.designPattern.visitor;

/**
 * @Description：訪問者模式
 * 访问者模式把数据结构和作用于结构上的操作解耦合，使得操作集合可相对自由地演化。访问者模式适用于数据结构相对稳定算法又易变化的系统
 * 简单来说，访问者模式就是一种分离对象数据结构与行为的方法，通过这种分离，可达到为一个被访问者动态添加新的操作而无需做其它的修改的效果
 * @Author： thtrt
 * @Createdate： 1/18/2018 3:52 PM
 */
public interface Visitor {
    public void visit(Subject subject);
}
