package com.others.linkedList;

/**
 * @Description：實現簡單的單鏈表 來源:http://blog.csdn.net/zhangerqing/article/details/8796518
 * @Author： thtrt
 * @Createdate： 1/17/2018 3:16 PM
 */
public class LinkedList<T> {
    //結點類
    private static class Node<T>{
        T data;
        Node<T> next;
        Node(T data,Node<T> next){
            this.data = data;
            this.next = next;
        }
        Node(T data){
            this(data,null);
        }
    }
    //主方法：用於測試
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.addHead(0);
        linkedList.addTail(1);
        linkedList.insert(0,5);
        linkedList.insert(1,6);
        linkedList.insert(2,7);

        linkedList.printList();
    }
    //數據
    private Node<T> head,tail;

    public LinkedList(){
        head = tail = null;
    }
    //判斷單鏈表是否爲空
    public boolean isEmpty(){
        return head == null;
    }
    //添加頭結點
    public void addHead(T item){
        head = new Node<T>(item);
        if(tail == null)
            tail = head;
    }
    //添加尾結點
    public void addTail(T item){
        if(!isEmpty()){
            tail.next = new Node<T>(item);
            tail = tail.next;
        }else {
            head = tail = new Node<T>(item);
        }
    }
    //打印
    public void printList(){
        if(isEmpty())
            System.out.println("null");
        else
            for (Node<T> p=head;p!=null;p=p.next)
                System.out.println(p.data);
    }
    //在頭部插入結點
    public void addFromHead(T item){
        Node<T> newNode = new Node<T>(item);
            head.next = newNode;
            head = newNode;
    }
    //在尾部插入結點
    public void addFromTail(T item){
        Node<T> newNode = new Node<T>(item);

        Node<T> p = head;
        //找到最後一個位置
        while(p.next!=null)
            p=p.next;

        //跳出循環說明是在後一個位置了
        p.next = newNode;
        newNode.next = null;
    }
    //刪除頭結點
    public void removeFromeHead(){
        if(!isEmpty())
            head = head.next;
        else
            System.out.println("The list have been emptied!");
    }
    //刪除尾結點
    public void removeFromTail(){

    }
    //插入一個新結點:關鍵代碼看圖
    public boolean insert(T appointedItem,T item){
        Node<T> pre = head,curr=head.next;
        Node<T> newNode = new Node<T>(item);
        if(!isEmpty()){
            //尋找插入位置
            while((curr!=null)&&(!appointedItem.equals(curr.data))){
                pre = curr;
                curr = curr.next;
            }
            pre.next = newNode;
            newNode.next = curr;
            return true;
        }
        return false;
    }
    //刪除一個元素:關鍵代碼看圖
    public void remove(T item){
        Node<T> curr = head,prev = null;
        boolean found = false;

        while(curr!=null&&!found){
            if(item.equals(curr.data)){
                if (item.equals(curr.data)) {
                    if (prev == null)
                        removeFromeHead();
                    else
                        prev.next = curr.next;
                    found = true;
                } else {//這個不知道要幹嘛
                    prev = curr;
                    curr = curr.next;
                }
            }
        }
    }
    //指定元素在鏈表中的位置
    public int indexOf(T item) {
        int index = 0;
        Node<T> p;
        for (p = head; p != null; p = p.next) {
            if (item.equals(p.data))
                return index;
            index++;

        }
        return -1;
    }
    //是否含有某個元素
    public boolean contains(T item){
        return indexOf(item)!=-1;
    }
}
