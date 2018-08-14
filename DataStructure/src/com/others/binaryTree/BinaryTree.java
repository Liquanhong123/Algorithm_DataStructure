package com.others.binaryTree;

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @Description：二叉樹的具體實現
 * @Author： Lixiaohong_666
 * @Createdate： 1/18/2018 2:53 PM
 */
public class BinaryTree<T> implements BinaryTreeInterface<T>,Serializable {
    //樹的根結點
    private BinaryNodeInterface<T> root;

    //中序遍歷
    private class InorderIterator<T> implements Iterator<T>{
        //定义一个顺序栈nodeStack来存放遍历过程中遇到的结点
        private Stack<BinaryNodeInterface<T>> nodeStack;
        private BinaryNodeInterface<T> currentNode;
        //構造
        public InorderIterator(){
            nodeStack = new SequenceStack<>();
            //此处为什么需要强制转换呢？
            currentNode = (BinaryNodeInterface<T>) root;
        }
        /*
        * 按照中序遍历的逻辑进行实现Iterator接口中的方法，从而实现一个迭代器
        */
        @Override
        public boolean hasNext() {
            return (!nodeStack.empty()) || (currentNode != null);
        }

        @Override
        public T next() {
            BinaryNodeInterface<T> nextNode = null;
            while(currentNode!=null){
                nodeStack.push(currentNode);
                currentNode = currentNode.getLeftChild();
            }
            if(!nodeStack.empty()){
                nextNode = nodeStack.pop();
                assert nextNode != null;
                currentNode = nextNode.getRightChild();
            }
            else
                throw new NoSuchElementException();
            return nextNode.getData();
        }
        //仅仅是完成遍历的功能，删除功能是不需要有的。
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    //構造
    public BinaryTree(){
        root = null;
    }
    public BinaryTree(T rootData){
        root = new BinaryNode<>(rootData);
    }
    public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree){
        privateSetTree(rootData, leftTree, rightTree);
    }
    @Override
    public void setTree(T rootData) {
        root = new BinaryNode<T>(rootData);
    }

    @Override
    public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree) {
        privateSetTree(rootData, (BinaryTree)leftTree, (BinaryTree)rightTree);
    }
    private void privateSetTree(T rootData, BinaryTree<T>leftTree, BinaryTree<T> rightTree){
        root = new BinaryNode<T>(rootData);
        if((leftTree != null) && (!leftTree.isEmpty()))
            root.setLeftChild(leftTree.root);
        if((rightTree != null) && (!rightTree.isEmpty())){
            if(rightTree != leftTree)
                root.setRightChild(rightTree.root);
            else
                root.setRightChild(rightTree.root.copy());
        }
        if((leftTree != null) && (leftTree != this))
            leftTree.clear();
        if((rightTree != null) && (rightTree != this))
            rightTree.clear();
    }
    @Override
    public T getRootData() {
        T rootData = null;
        if(root !=null)
            rootData = root.getData();
        return rootData;
    }

    @Override
    public int getHeight() {
        return root.getHeight();
    }

    @Override
    public int getNumberOfNodes() {
        return root.getumberOfNodes();
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public void clear() {
        root = null;
    }
    //中序遍历二叉树：這是不用迭代器的方法
    public void inorderTraverse(){
        inorderTraverse(root);
    }

    private void inorderTraverse(BinaryNodeInterface<T> node){
        if(node != null){
            inorderTraverse((BinaryNode)node.getLeftChild());
            System.out.println(node.getData());//若使用迭代器，可以在测试程序中输出，而不是在这里使用输出语句
            inorderTraverse((BinaryNode)node.getRightChild());
        }
    }
    //前序遍歷
    public void preorderTraverse(){
        preorderTraverse(root);
    }

    private void preorderTraverse(BinaryNodeInterface<T> node){
        if(node != null){
            System.out.println(node.getData());
            preorderTraverse((BinaryNode)node.getLeftChild());
            preorderTraverse((BinaryNode)node.getRightChild());
        }
    }
    //後序遍歷
    public void postorderTraverse(){
        postorderTraverse(root);
    }
    private void postorderTraverse(BinaryNodeInterface<T> node){
        if(node != null){
            postorderTraverse((BinaryNode)node.getLeftChild());
            postorderTraverse((BinaryNode)node.getRightChild());
            System.out.println(node.getData());
        }
    }
    @Override
    public Iterator<T> getPreorderIterator() {
        return null;
    }

    @Override
    public Iterator<T> getPostorderIterator() {
        return null;
    }
    //中序遍历二叉树
    @Override
    public Iterator<T> getInorderIterator() {
        return new InorderIterator();
    }

    @Override
    public Iterator<T> getLevelOrderIterator() {
        return null;
    }
}
