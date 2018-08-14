package com.others.binaryTree;

import java.util.Iterator;

/**
 * @Description：遍历的迭代器
 * @Author： Lixiaohong_666
 * @Createdate： 1/18/2018 11:34 AM
 */
public interface TreeIteratorInterface<T> {
    public Iterator<T> getPreorderIterator();
    public Iterator<T> getPostorderIterator();
    //目前只實現了它
    public Iterator<T> getInorderIterator();
    public Iterator<T> getLevelOrderIterator();
}
