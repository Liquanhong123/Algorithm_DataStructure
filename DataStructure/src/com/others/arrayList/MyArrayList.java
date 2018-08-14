package com.others.arrayList;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @Description：實現ArrayList
 * @Author： thtrt
 * @Createdate： 1/13/2018 9:04 PM
 */
public class MyArrayList<AnyType> implements Iterable<AnyType> {
    private static final int DEFAULT_CAPACITY = 10;
    private int theSize;
    private AnyType[] theItems;

    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        for (int i = 0; i < 15; i++)
            myArrayList.add(i);
        System.out.println(myArrayList);
        myArrayList.remove(0);
        System.out.println(myArrayList);
    }

    //構造一個空的 arrayList
    public MyArrayList() {
        doClear();
    }

    private void doClear() {
        theSize = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }

    //獲得大小
    public int size() {
        return theSize;
    }

    //判斷是否爲空
    public boolean isEmpty() {
        return size() == 0;
    }

    //調整大小
    public void trimToSize() {
        ensureCapacity(size());
    }

    //擴容（調整大小）
    private void ensureCapacity(int newCapacity) {
        if (newCapacity < theSize)
            return;
        //老數組
        AnyType[] old = theItems;
        //新數組
        theItems = (AnyType[]) new Object[newCapacity];
        //拷貝
        for (int i = 0; i < size(); i++) {
            theItems[i] = old[i];
        }
    }

    //根據索引獲得指定元素
    public AnyType get(int index) {
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return theItems[index];
    }

    //通過索引設置元素的值
    public AnyType set(int index, AnyType newVal) {
        if (index < 0 || index >= size())
            throw new ArrayIndexOutOfBoundsException();

        AnyType old = theItems[index];
        theItems[index] = newVal;
        return old;
    }

    //插入元素
    public boolean add(AnyType x) {
        add(size(), x);
        return true;
    }

    public void add(int index, AnyType x) {
        if (theItems.length == size())
            ensureCapacity(size() * 2 + 1);
        //index後的元素都後移
        for (int i = theSize; i > index; i--)
            theItems[i] = theItems[i - 1];
        theItems[index] = x;

        theSize++;
    }

    //移除元素
    public AnyType remove(int index) {
        AnyType removeItem = theItems[index];
        //所有index後的元素前移
        for (int i = index; i < size() - 1; i++) {
            theItems[i] = theItems[i + 1];
        }
        theSize--;
        return removeItem;
    }

    @Override
    public Iterator<AnyType> iterator() {
        return new ArrayListIterator();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");

        for (AnyType x : this)
            sb.append(x + " ");
        sb.append("]");

        return new String(sb);
    }

    private class ArrayListIterator implements java.util.Iterator<AnyType> {
        private int current = 0;
        private boolean okToRemove = false;

        @Override
        public boolean hasNext() {
            return current < size();
        }

        @Override
        public AnyType next() {
            if (!hasNext())
                throw new NoSuchElementException();

            okToRemove = true;
            return theItems[current++];
        }

        @Override
        public void remove() {
            if (!okToRemove)
                throw new IllegalStateException();

            MyArrayList.this.remove(--current);
            okToRemove = false;
        }
    }

}
