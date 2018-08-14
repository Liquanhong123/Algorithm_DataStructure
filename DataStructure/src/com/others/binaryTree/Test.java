package com.others.binaryTree;

import java.util.Iterator;

/**
 * @Description：測試類
 *          10
 *        /   \
 *      20    30
 *     / \    /
 *    40 50  60
 * @Author： Lixiaohong_666
 * @Createdate： 1/18/2018 3:22 PM
 */
public class Test {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<>(10);
        BinaryTree<Integer> leftChild = new BinaryTree<>(20);
        BinaryTree<Integer> rightChild = new BinaryTree<>(30);
        BinaryTree<Integer> lLChild = new BinaryTree<>(40);
        BinaryTree<Integer> lRChild = new BinaryTree<>(50);
        BinaryTree<Integer> rLChild = new BinaryTree<>(60);
        leftChild.setTree(20,lLChild,lRChild);
        rightChild.setTree(30,rLChild,null);
        binaryTree.setTree(10,leftChild,rightChild);
        //中序
        System.out.println("********中序遍歷結果(兩種方法)*******");
//        binaryTree.inorderTraverse();
        Iterator<Integer> iterator = binaryTree.getInorderIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());


        //前序
        System.out.println("********前序遍歷結果*******");
        binaryTree.preorderTraverse();
        //後序
        System.out.println("********後序遍歷結果*******");
        binaryTree.postorderTraverse();
    }
}
