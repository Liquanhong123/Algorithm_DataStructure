package com.others.binaryTree.simple;


import com.others.binarySearchTree.BinaryNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description：測試類
 * *          10
 *        /   \
 *      20    30
 *     / \    /
 *    40 50  60
 * @Author： Lixiaohong_666
 * @Createdate： 1/18/2018 6:49 PM
 */
public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree<String>  bt = new BinaryTree<String>("10");
        BinaryTree.TreeNode tn1 = bt.addNode(bt.root(),"20", true);
        BinaryTree.TreeNode tn2 = bt.addNode(bt.root(), "30", false);

        BinaryTree.TreeNode tn3 = bt.addNode(tn1,"40",true);
        BinaryTree.TreeNode tn4 = bt.addNode(tn1,"50",false);
        BinaryTree.TreeNode tn5 = bt.addNode(tn2,"60",true);
        //中序遍歷
        System.out.println("\n inorder traverse");
        List<BinaryTree.TreeNode> list1 = bt.inTraverse();;
        for(BinaryTree.TreeNode node : list1)
            System.out.print(node.data + " ");
        //先序遍歷
        System.out.println("\n preorder traverse");
        List<BinaryTree.TreeNode> list2 =  bt.preTraverse();;
        for(BinaryTree.TreeNode node : list2)
            System.out.print(node.data + " ");
        //層序遍歷
        System.out.println("\n level traverse");
        List<BinaryTree.TreeNode> list3 = bt.levelTraverse();;
        for(BinaryTree.TreeNode node : list3)
            System.out.print(node.data + " ");
        //後序遍歷
        System.out.println("\n post traverse");
        List<BinaryTree.TreeNode> list4 = bt.postTraverse();
        for(BinaryTree.TreeNode node: list4)
            System.out.print(node.data+" ");
    }
}
