package com.designPattern1.Composite;

/**
 * @Description:樹類
 * @Author:Lixiaohong_666
 * @Date:Created in 17:09 2018/2/2
 */
public class Tree {
    public TreeNode root;
    public Tree(){

    }
    public Tree(String treeName){
        root = new TreeNode(treeName);
    }
}
