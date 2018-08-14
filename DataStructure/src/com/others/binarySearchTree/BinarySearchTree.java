package com.others.binarySearchTree;

public class BinarySearchTree<Object extends Comparable<? super Object>> {
    //根結點
    private BinaryNode<Object> root;

    //構造
    public BinarySearchTree() {
        root = null;
    }

    //插入一個結點到樹中，若重複則忽略
    public void insert(Object x) {
        root = insert(x, root);
    }

    public BinaryNode<Object> insert(Object x, BinaryNode<Object> t) {
        if (t == null) {
            return new BinaryNode<Object>(x, null, null);
        }
        int compareResult = x.compareTo(t.element);
        if (compareResult < 0) {
            t.left = insert(x, t.left);
        } else if(compareResult > 0) {
            t.right = insert(x, t.right);
        }else//重複,不處理
             ;
        return t;
    }
    //打印樹(有序)
    public void printTree(){
        if(isEmpty()){
            System.out.println("空樹!");
        }
        else{
            printTree(root);
        }
    }
    private void printTree(BinaryNode<Object> t){
        if(t != null){
            printTree(t.left);
            System.out.println(t.element);
            printTree(t.right);
        }
    }
    //刪除某個結點
    public void remove(Object x){
        root = remove(x,root);
    }
    private BinaryNode<Object> remove(Object x,BinaryNode<Object> t){
        if(t==null){//沒有找到，不處理
            return t;
        }
        int compareResult = x.compareTo(t.element);
        if(compareResult<0)
               t.left = remove(x,t.left);
        else if(compareResult>0)
            t.right = remove(x,t.right);
        else if(t.left != null && t.right != null){//兩個孩子
            t.element = findMin(t.right).element;
            t.right = remove(t.element,t.right);
        }
        else
             t = (t.left!=null)?t.left:t.right;
            return t;
    }
    //刪除整棵樹
    public void makeEmpty() {
        root = null;
    }

    //判斷是否爲空
    public boolean isEmpty() {
        return root == null;
    }

    //是否含有某個節點
    public boolean contains(Object x) {
        return contains(x, root);
    }

    private boolean contains(Object x, BinaryNode<Object> t) {
        if (t == null)
            return false;

        int compareResult = x.compareTo(t.element);

        if (compareResult < 0)
            return contains(x, t.left);
        else if (compareResult > 0)
            return contains(x, t.right);
        else
            return true;    // Match
    }

    //找到最小值（遞歸實現）
    public Object findMin() {
        if (isEmpty()) try {
            throw new Exception("樹爲空！");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return findMin(root).element;
    }

    private BinaryNode<Object> findMin(BinaryNode t) {
        if (t == null) {
            return null;
        } else if (t.left == null) {//最小結點，左子樹肯定爲Null
            return t;
        }
        return findMin(t.left);
    }

    //找到最大值（非遞歸實現）
    public Object findMax() {
        if (isEmpty()) try {
            throw new Exception("樹爲空！");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return findMax(root).element;
    }

    private BinaryNode<Object> findMax(BinaryNode t) {
        if (t != null) {
            while (t.right != null) {//右子樹肯定不爲null
                t = t.right;
            }
        }
        return t;
    }
}
