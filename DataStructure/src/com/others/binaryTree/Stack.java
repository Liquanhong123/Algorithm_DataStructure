package com.others.binaryTree;

/**
 * @Description：栈接口
 * 參考連接http://www.cnblogs.com/hapjin/p/4442729.html
 * @Author： Lixiaohong_666
 * @Createdate： 1/18/2018 2:42 PM
 */
public interface Stack<E> {
    public int length();//返回栈的长度

    public E pop();//出栈

    public void push(E element);//进栈

    public E peek();//访问栈顶元素

    public boolean empty();//判断栈是否为空

    public void clear();//清空栈
}
