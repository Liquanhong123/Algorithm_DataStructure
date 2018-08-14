package com.interviews.link;

/**
 * @Description：鏈表接口
 * @Author： thtrt
 * @Createdate： 1/18/2018 8:19 PM
 */
public interface Link {
    //向链表增加数据
    void add(Object data);

    //可以增加一组对象
    void add(Object data[]);

    //在链表中删除数据
    void delete(Object data);

    //判断数据是否存在
    boolean exists(Object data);

    //取得全部的保存对象
    Object[] getAll();

    //根据保存的位置取出指定对象
    Object get(int index);

    //求出链表的长度
    int length();
}
