package com.others.binarySearchTree;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
       /* for (int i = 0;i<10;i++){
            int tmp=new Random().nextInt(50);
            binarySearchTree.insert(tmp);
        }*/
        System.out.println("刪除元素前...");
        binarySearchTree.insert(35);
        binarySearchTree.insert(26);
        binarySearchTree.insert(47);
        binarySearchTree.insert(18);
        binarySearchTree.insert(27);
        binarySearchTree.insert(21);
        binarySearchTree.insert(33);
        binarySearchTree.insert(38);
        binarySearchTree.insert(41);
        /**
         *      35
         *   /     \
         *  26     47
         * / \     /
         *18  27   38
         *  \   \    \
         *  21  33     41
         */
        binarySearchTree.printTree();
        //刪除指定結點是這段代碼最複雜的部分，參考書中P82-83
        binarySearchTree.remove(41);
        binarySearchTree.remove(21);
        System.out.println("刪除元素後...");
        binarySearchTree.printTree();
    }
}
