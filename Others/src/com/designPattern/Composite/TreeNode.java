package com.designPattern.Composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @Description：組合模式，常用於表示樹形結構
 * @Author： thtrt
 * @Createdate： 1/15/2018 11:28 AM
 */
public class TreeNode {
    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<>();

    public TreeNode(String name) {
        this.name = name;
    }

    //添加孩子結點
    public void add(TreeNode node){
        children.add(node);
    }
    //刪除孩子結點
    public void remove(TreeNode node){
        children.remove(node);
    }
    //取得孩子結點
    public Enumeration<TreeNode> getChildren(){
        return children.elements();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
}
