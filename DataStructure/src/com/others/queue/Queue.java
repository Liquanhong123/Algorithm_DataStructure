package com.others.queue;

import java.util.Arrays;

/**
 * @Description：隊列的基本實現。參考連接http://blog.csdn.net/zhangerqing/article/details/8796518
 * @Author： thtrt
 * @Createdate： 1/17/2018 4:14 PM
 */
public class Queue<AnyType> {
    //默認大小
    private final int DEFAULT_SIZE = 10;
    //隊列大小
    private int capacity;
    //對象數組
    private Object[] elementData;
    //頭指針
    private int front = 0;
    //尾指針
    private int rear = 0;
    //主方法：用於測試
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>("ABC",20);
        queue.add("DEF");
        queue.add("ghi");
        System.out.println(queue.empty());
        System.out.println(queue.size());
        System.out.println(queue.element());

        queue.remove();
        //queue.clear();
        System.out.println(queue.element());
        System.out.println(queue.empty());
        System.out.println(queue.size());
    }
    //構造
    public Queue(){
        capacity = DEFAULT_SIZE;
        elementData = new Object[capacity];
    }
    public Queue(AnyType element){
        this();
        elementData[0] = element;
        rear++;
    }
    public Queue(AnyType element,int initSize){
        this.capacity = initSize;
        elementData = new Object[capacity];
        elementData[0] = element;
        rear++;
    }
    public int size(){
        return rear - front;
    }
    //添加元素(入隊)
    public void add(AnyType element){
        if(rear>capacity-1){
            throw new IndexOutOfBoundsException("the queue is full!");
        }
        //先賦值，然後尾指針後移
        elementData[rear++] = element;
    }
    //刪除(隊頭)元素
    public AnyType remove()
    {
        if (empty())
        {
            throw new IndexOutOfBoundsException("queue is empty");
        }

        @SuppressWarnings("unchecked")
        AnyType oldValue = (AnyType)elementData[front];

        elementData[front++] = null;
        return oldValue;
    }
    //取對頭元素
    public AnyType element(){
        if(empty()){
            throw  new IndexOutOfBoundsException("queue is empty");
        }
        return (AnyType)elementData[front];
    }
    //清空
    public void clear(){
        Arrays.fill(elementData,null);
        front = 0;
        rear = 0;
    }
    private boolean empty() {
        return rear == front;
    }
    //toString()
    public String toString()
    {
        if (empty())
        {
            return "[]";
        }
        else
        {
            StringBuilder sb = new StringBuilder("[");
            for (int i = front  ; i < rear ; i++ )
            {
                sb.append(elementData[i].toString() + ", ");
            }
            int len = sb.length();
            return sb.delete(len - 2 , len).append("]").toString();
        }
    }
}
