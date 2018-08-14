package com.others.binaryTree;

/**
 * @Description：二叉樹的接口---JAVA接口可以多繼承
 * @Author： Lixiaohong_666
 * @Createdate： 1/18/2018 11:36 AM
 */
public interface BinaryTreeInterface<T> extends TreeInterface<T>,TreeIteratorInterface<T> {
    //構造一顆以rootData爲根的二叉樹
    public void setTree(T rootData);
    //構造一顆以rootData爲根,leftTree爲左子樹,rightTree爲右子樹的二叉樹
    public void setTree(T rootData,BinaryTreeInterface<T> leftTree,BinaryTreeInterface<T> rightTree);
}
