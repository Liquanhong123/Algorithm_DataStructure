package com.others.binarySearchTree;

//結點類
public class BinaryNode<Object> {
    //結點元素
    Object element;
    //左孩子
    BinaryNode left;
    //右孩子
    BinaryNode right;

    BinaryNode( Object theElement )
    {
        this( theElement, null, null );
    }
    BinaryNode( Object theElement, BinaryNode<Object> lt, BinaryNode<Object> rt )
    {
        element  = theElement;
        left     = lt;
        right    = rt;
    }
}
