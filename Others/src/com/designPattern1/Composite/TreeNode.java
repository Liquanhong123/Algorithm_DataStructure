package com.designPattern1.Composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @Description:
 * @Author:Lixiaohong_666
 * @Date:Created in 17:02 2018/2/2
 */
public class TreeNode {
    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<TreeNode>();
    //構造
    public TreeNode(){

    }
    //獲取子結點
    public Enumeration<TreeNode> getChildren() {
        return children.elements();
    }

    public void setChildren(Vector<TreeNode> children) {
        this.children = children;
    }

    public TreeNode(String name){
        this.name=name;
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
    //添加孩子結點
    public void addChild(TreeNode child){
        children.add(child);
    }
    //刪除子節點
    public void removeChild(TreeNode child){
        children.remove(child);
    }
}
