package com.others.binaryheap;

import org.omg.CORBA.Any;

/**
 * @Description：二叉堆(最小堆)
 * @Author： thtrt
 * @Createdate： 1/16/2018 9:00 PM
 */
public class BinaryHeap<AnyType extends Comparable<? super AnyType >>  {
    //默認大小
    private static final int DEFAULT_CAPACITY = 10;
    //當前大小
    private int currentSize;
    //對象數組
    private AnyType [ ] array;

    //主方法，用於測試
    public static void main(String[] args) throws Exception {
        BinaryHeap<Integer> binaryHeap = new BinaryHeap<>();
        //用P159中的數據測試
        binaryHeap.insert(32);
        binaryHeap.insert(31);
        binaryHeap.insert(21);
        binaryHeap.insert(24);
        binaryHeap.insert(26);
        //最小
        binaryHeap.insert(13);
        binaryHeap.insert(16);
        //倒數第二
        binaryHeap.insert(19);
        binaryHeap.insert(68);

        binaryHeap.deleteMin();
        binaryHeap.deleteMin();
        System.out.println(binaryHeap.findMin());
    }
    //構造方法
    public  BinaryHeap(){
        this(DEFAULT_CAPACITY);
    }
    public BinaryHeap(int capacity){
        currentSize = 0;
        array = (AnyType[]) new Comparable[capacity + 1];
    }
    public BinaryHeap(AnyType[] items){
        currentSize = items.length;
        array = (AnyType[])new Comparable[( currentSize + 2 ) * 11 / 10];

        int i = 1;
        for(AnyType item: items)
            array[i++] = item;
        //構建堆
        buildHeap();
    }
    //構建堆：從最後一個非葉子節點開始
    private void buildHeap() {
        for(int i=currentSize/2;i>0;i--)
            percolateDown(i);
    }
    //下濾
    //刪除最小元，構建堆時用 參考圖6-9 6-11
    private void percolateDown(int hole) {
        int child;
        AnyType tmp = array[hole];

        for(;hole*2<=currentSize;hole=child){
            child = hole*2;
            //找最小的
            if(child!=currentSize&&array[child+1].compareTo(array[child])<0){
                child++;
            }
            if(array[child].compareTo(tmp)<0){
                array[hole] = array[child];
            }
            else break;
        }
        //跳出循環說明是最後一層了
        array[hole] = tmp;
    }
    //插入元素---上濾
    public void insert(AnyType x){
        if(currentSize == array.length-1)
            enlargeArray(array.length*2+1);
        //上濾 見圖6-6 6-7
        //新建的空穴
        int hole = ++currentSize;
        //尋找插入位置
        for(array[0]=x;x.compareTo(array[hole/2])<0;hole/=2){
            array[hole] = array[hole/2];
        }
        //跳出循環說明找到了正確的插入位置
        array[hole] = x;
    }
    //擴容
    private void enlargeArray(int newSize) {
        AnyType[] old = array;
        //新創建數組
        array = (AnyType[])new Comparable[newSize];
        //把老數組拷貝到新數組
        for(int i=0;i<old.length;i++)
            array[i]=old[i];
    }
    //找到最小元素
    public AnyType findMin() throws Exception{
        if(isEmpty()){
            throw  new Exception("下溢!");
        }
        return array[1];
    }
    //刪除最小元
    public AnyType deleteMin() throws Exception{
        if(isEmpty())
            throw new Exception("下溢!");
        AnyType minItem = findMin();
        //最後一個元素臨時放到堆頂
        array[1] = array[currentSize--];
        //下濾
        percolateDown(1);
        return minItem;
    }
    //製空
    public void makeEmpty(){
        currentSize = 0;
    }


    private boolean isEmpty() {
        return currentSize == 0;
    }
}
