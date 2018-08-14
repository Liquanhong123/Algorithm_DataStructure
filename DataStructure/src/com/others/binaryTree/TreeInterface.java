package com.others.binaryTree;

/**
 * @Description：樹的接口
 * 參考連接http://www.cnblogs.com/hapjin/p/4456785.html
 * @Author： Lixiaohong_666
 * @Createdate： 1/18/2018 11:28 AM
 */
public interface TreeInterface<T> {
    //獲得根結點的值
    public T getRootData();
    //獲得樹的高度
    public int getHeight();
    //獲得樹的結點數
    public int getNumberOfNodes();
    //判斷是否爲空
    public boolean isEmpty();
    //清空
    public void clear();
}
