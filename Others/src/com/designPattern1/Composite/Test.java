package com.designPattern1.Composite;

/**
 * @Description:
 * @Author:Lixiaohong_666
 * @Date:Created in 17:10 2018/2/2
 */
public class Test {
    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        nodeB.addChild(nodeC);
        tree.root.addChild(nodeB);
        System.out.println("build the tree finished!");
    }
}
