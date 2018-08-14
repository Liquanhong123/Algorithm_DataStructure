package com.others.binaryTree;

import java.io.Serializable;

/**
 * @Description：
 * @Author： Lixiaohong_666
 * @Createdate： 1/18/2018 11:53 AM
 */
public class BinaryNode<T> implements BinaryNodeInterface<T>,Serializable {
    private T data;//结点的数据域
    private BinaryNode<T> left;//左孩子
    private BinaryNode<T> right;//右孩子
    //構造
    public BinaryNode(){
        this(null);
    }
   //构造一个值为dataPortaion的结点
    public BinaryNode(T dataPortion){
        this(dataPortion,null,null);
    }
    public BinaryNode(T dataPortion,BinaryNode<T> leftChild,BinaryNode<T> rightChild){
        data = dataPortion;
        left = leftChild;
        right = rightChild;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T newData) {
        data = newData;
    }

    @Override
    public BinaryNodeInterface<T> getLeftChild() {
        return left;
    }

    @Override
    public BinaryNodeInterface<T> getRightChild() {
        return right;
    }

    @Override
    public void setLeftChild(BinaryNodeInterface<T> leftChild) {
        left = (BinaryNode<T>)leftChild;
    }

    @Override
    public void setRightChild(BinaryNodeInterface<T> rightChild) {
        right = (BinaryNode<T>)rightChild;
    }

    @Override
    public boolean hasLeftChild() {
        return left != null;
    }

    @Override
    public boolean hasRightChild() {
        return right != null;
    }

    @Override
    public boolean isLeaf() {
        return (left == null) && (right == null);
    }
    //返回以该结点为根的子树中的结点的个数(包括根结点)
    @Override
    public int getumberOfNodes() {
        int leftNumber = 0;
        int rightNumber = 0;
        if(left !=null )
            leftNumber = left.getumberOfNodes();
        if(right !=null )
            rightNumber = right.getumberOfNodes();

        return 1+leftNumber+rightNumber;
    }
    //返回以此结点为根的子树的高度
    @Override
    public int getHeight() {
        return getHeight(this);
    }

    private int getHeight(BinaryNode<T> node) {
        int height = 0;
        if(node!=null)
            height = 1+Math.max(getHeight(node.left),getHeight(node.right));
        return height;
    }
    //该方法被构造二叉树的setTree()方法调用
    @Override
    public BinaryNodeInterface<T> copy() {
       BinaryNode<T> newRoot = new BinaryNode<>(data);
       if(left !=null )
           newRoot.left = (BinaryNode<T>)left.copy();
       if(right!=null)
           newRoot.right = (BinaryNode<T>)right.copy();
        return newRoot;
    }
}
