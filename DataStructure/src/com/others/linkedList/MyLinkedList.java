package com.others.linkedList;

import java.util.Iterator;

/**
 * @Description：LinkedList實現
 * @Author： thtrt
 * @Createdate： 1/14/2018 11:58 AM
 */
public class MyLinkedList<AnyType> implements  Iterable<AnyType> {
    //大小
    private int theSize;
    //修改的次數
    private int modCount = 0;
    //前指針?
    private Node<AnyType> beginMarker;
    //後指針?
    private Node<AnyType> endMarker;

    //主方法：用於測試
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        for(int i=0;i<10;i++)
            myLinkedList.add(i);
        System.out.println(myLinkedList);
        myLinkedList.remove(0);
        System.out.println(myLinkedList);
        for(int i = 11;i<20;i++)
            myLinkedList.add(0,i);
        System.out.println(myLinkedList);
    }

    //結點類
    private static class Node<AnyType>{
        //數據域
        public AnyType data;
        //前指針
        public Node<AnyType> prev;
        //後指針
        public Node<AnyType> next;

        public Node(AnyType data, Node<AnyType> prev, Node<AnyType> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
    //構造一個空的鏈表
    public MyLinkedList(){
        doClear();
    }

    private void doClear() {
        beginMarker = new Node<>( null, null, null );
        endMarker = new Node<>(null,beginMarker,null);
        beginMarker.next = endMarker;

        theSize = 0;
        modCount++;
    }
    private void clear(){
        doClear();
    }
    //獲得大小
    public int size(){
        return theSize;
    }
    //判斷是否爲空
    public boolean isEmpty(){
        return size()==0;
    }
    //在末尾添加一個元素
    public boolean add(AnyType x){
        add(size(),x);
        return true;
    }
    //在指定位置添加一個元素
    public void add(int index,AnyType x){
        addBefore(getNode(index,0,size()),x);
    }
    //在結點P之前插入結點
    //這段代碼很關鍵：結合書本圖片理解
    private void addBefore(Node<AnyType> p, AnyType x) {
        //新建一個結點指向P的前一個結點，並讓P指向它
        Node<AnyType> newNode = new Node<>(x,p.prev,p);
        //P的前一個結點的next指針指向新建結點
        p.prev.next = newNode;
        //P的prev指針指向新建的結點
        p.prev = newNode;

        theSize++;
        modCount++;
    }

    //獲得指定位置的結點
    private Node<AnyType> getNode(int index){
        return getNode(index,0,size()-1);
    }
    //獲得指定位置的結點，必須傳遞兩個從低到高的索引
    private Node<AnyType> getNode( int idx, int lower, int upper )
    {
        Node<AnyType> p;

        if( idx < lower || idx > upper )
            throw new IndexOutOfBoundsException( "getNode index: " + idx + "; size: " + size( ) );

        if( idx < size( ) / 2 )
        {//從開始結點找
            p = beginMarker.next;
            for( int i = 0; i < idx; i++ )
                p = p.next;
        }
        else
        {//從後往前找
            p = endMarker;
            for( int i = size( ); i > idx; i-- )
                p = p.prev;
        }

        return p;
    }
    //根據索引獲得元素
    public AnyType get(int index){
        return getNode(index).data;
    }
    //改變指定索引位置的值
    public AnyType set(int index,AnyType newVal){
        Node<AnyType> p = getNode(index);
        AnyType oldVal = p.data;

        p.data  = newVal;
        return oldVal;
    }
    //刪除元素
    public AnyType remove(int index){
        return remove(getNode(index));
    }
    private AnyType remove(Node<AnyType> p){
        //p的下一個結點的prev指針指向 p的前一個結點
        p.next.prev = p.prev;
        //p的前一個結點的next指針指向 p的後一個結點
        p.prev.next = p.next;

        theSize--;
        modCount--;
        return p.data;
    }
    //toString()
    public String toString( )
    {
        StringBuilder sb = new StringBuilder( "[ " );

        for( AnyType x : this )
            sb.append( x + " " );
        sb.append( "]" );

        return new String( sb );
    }
    @Override
    public Iterator<AnyType> iterator() {
        return  new LinkedListIterator( );
    }
    private class LinkedListIterator implements java.util.Iterator<AnyType>
    {
        private Node<AnyType> current = beginMarker.next;
        private int expectedModCount = modCount;
        private boolean okToRemove = false;

        public boolean hasNext( )
        {
            return current != endMarker;
        }

        public AnyType next( )
        {
            if( modCount != expectedModCount )
                throw new java.util.ConcurrentModificationException( );
            if( !hasNext( ) )
                throw new java.util.NoSuchElementException( );

            AnyType nextItem = current.data;
            current = current.next;
            okToRemove = true;
            return nextItem;
        }

        public void remove( )
        {
            if( modCount != expectedModCount )
                throw new java.util.ConcurrentModificationException( );
            if( !okToRemove )
                throw new IllegalStateException( );

            MyLinkedList.this.remove( current.prev );
            expectedModCount++;
            okToRemove = false;
        }
    }
}
