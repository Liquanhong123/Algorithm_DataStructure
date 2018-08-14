package com.interviews.constructTree;

/**
 * @Description：二叉樹結點類
 * @Author： thtrt
 * @Createdate： 1/19/2018 4:37 PM
 */
public class BinaryTreeNode {
    //根結點值？
    int m_nValue;
    BinaryTreeNode m_pLeft;
    BinaryTreeNode m_pRight;
    //構造
    public BinaryTreeNode(int m_nValue) {
        this.m_nValue = m_nValue;
    }

    public int getM_nValue() {
        return m_nValue;
    }

    public void setM_nValue(int m_nValue) {
        this.m_nValue = m_nValue;
    }

    public BinaryTreeNode getM_pLeft() {
        return m_pLeft;
    }

    public void setM_pLeft(BinaryTreeNode m_pLeft) {
        this.m_pLeft = m_pLeft;
    }

    public BinaryTreeNode getM_pRight() {
        return m_pRight;
    }

    public void setM_pRight(BinaryTreeNode m_pRight) {
        this.m_pRight = m_pRight;
    }
}
