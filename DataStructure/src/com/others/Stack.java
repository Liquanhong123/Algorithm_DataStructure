package com.others;

import com.others.linkedList.LinkedList;

/**
 * @Description：單鏈表實現棧。用了package com.others.linkedList。。參考連接:http://blog.csdn.net/zhangerqing/article/details/8796518
 * @Author： thtrt
 * @Createdate： 1/17/2018 5:51 PM
 */
public class Stack<T> {
    //結點類
    static class Node<T> {
        //數據
        T data;
        //指針
        Node<T> next;
        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
        Node(T data) {
            this(data, null);
        }
    }
    static LinkedList list = new LinkedList();
    //入棧
    public T push(T item){
        list.addFromHead(item);
        return item;
    }
    //出棧
    public void pop(){
        list.removeFromeHead();
    }
    //判斷是否爲Null
    public boolean isEmpty(){
        return list.isEmpty();
    }
    //查找
    public int search(T t){
        return list.indexOf(t);
    }

    //主方法：用於測試
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println(stack.isEmpty());
        //這段代碼還有點問題
        stack.push("abc");
        stack.push("def");
        stack.push("ghe");
        stack.push("egg");
        stack.pop();
        System.out.println(stack.search("def"));
        System.out.println(stack.search("egg"));
    }
}
