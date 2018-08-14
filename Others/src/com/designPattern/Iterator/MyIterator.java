package com.designPattern.Iterator;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/18/2018 10:31 AM
 */
public class MyIterator implements Iterator {
    private Collection collection;
    private int pos = -1;
    //構造

    public MyIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public Object previout() {
        if(pos>0)
            pos--;
        return collection.get(pos);
    }

    @Override
    public Object next() {
        if(pos<collection.size()-1)
            pos++;
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if(pos<collection.size()-1)
            return true;
        else
        return false;
    }

    @Override
    public Object first() {
        pos = 0;
        return collection.get(pos);
    }
}
