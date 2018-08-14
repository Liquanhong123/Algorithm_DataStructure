package com.others.binaryTree;

/**
 * @Description：二叉樹結點接口
 * @Author： Lixiaohong_666
 * @Createdate： 1/18/2018 11:45 AM
 */
public interface BinaryNodeInterface<T> {
    //返回結點的數據部分
    public T getData();
    //設置結點的數據
    public void setData(T newData);
    //獲取結點的左孩子
    public BinaryNodeInterface<T> getLeftChild();
    //獲取結點的右孩子
    public BinaryNodeInterface<T> getRightChild();
    //設置結點的左孩子爲指定結點
    public void setLeftChild(BinaryNodeInterface<T> leftChild);
    //設置結點的右孩子爲指定結點
    public void setRightChild(BinaryNodeInterface<T> rightChild);
    //判斷是否有左孩子
    public boolean hasLeftChild();
    //判斷是否有右孩子
    public boolean hasRightChild();
    //檢查結點是否是葉子節點
    public boolean isLeaf();
    //計算該結點爲根的子樹的結點數
    public int getumberOfNodes();
    //計算該結點爲根的子樹的高度
    public int getHeight();
    //複製該結點爲根的子樹
    public BinaryNodeInterface<T> copy();
}
