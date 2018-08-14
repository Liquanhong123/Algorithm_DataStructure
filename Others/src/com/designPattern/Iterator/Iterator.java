package com.designPattern.Iterator;

/**
 * @Description：迭代器模式
 * @Author： thtrt
 * @Createdate： 1/18/2018 10:27 AM
 */
public interface Iterator {
    //前移
    public Object previout();
    //後移
    public Object next();

    public boolean hasNext();

    //取得第一個元素
    public Object first();
}
