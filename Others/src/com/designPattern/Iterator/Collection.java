package com.designPattern.Iterator;

/**
 * @Description：迭代器模式
 * @Author： thtrt
 * @Createdate： 1/18/2018 10:26 AM
 */
public interface Collection {
    public Iterator iterator();

    //取得集合元素
    public Object get(int i);
    //取得集合大小
    public int size();
}
