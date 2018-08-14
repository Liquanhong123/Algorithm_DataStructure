package com.designPattern.Iterator;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/18/2018 10:30 AM
 */
public class MyCollection implements Collection {
    public String string[]={"A","B","C","D"};
    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
