package com.designPattern.Iterator;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/18/2018 10:36 AM
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator iterator = collection.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
