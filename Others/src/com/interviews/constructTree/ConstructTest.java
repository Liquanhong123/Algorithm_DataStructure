package com.interviews.constructTree;

import java.util.Arrays;

/**
 * @Description：重建二叉樹
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字，例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建出二叉树并输出它的头结点
 * 參考連接：http://www.cnblogs.com/yangyquin/p/4910624.html
 * @Author： thtrt
 * @Createdate： 1/19/2018 4:40 PM
 */
public class ConstructTest {
   //注意copyOfRange()參數區間[)
    public static BinaryTreeNode reConstrct(int[] preOrder,int [] inOrder)  {
        if(preOrder==null||inOrder==null)
            return null;
        // 前序遍历第一个节点是根节点
        int rootData = preOrder[0];
        BinaryTreeNode root = new BinaryTreeNode(rootData);
        root.m_pLeft = root.m_pRight = null;
        //一個數字
        if(preOrder.length==1&&inOrder.length==1){
            if(preOrder[0]==inOrder[0])
                return root;
            else
                throw new IllegalArgumentException("invalid input");
        }
        //在中序遍歷中找到rootData的位置
        int rootinIndex = 0;
        while (rootinIndex<inOrder.length&&rootData!=inOrder[rootinIndex]){
            rootinIndex++;
        }
        if (rootinIndex == inOrder.length && rootData != inOrder[rootinIndex - 1]) {
            throw new IllegalArgumentException("invalid input");
        }
        //有左孩子(遞歸)
        if(rootinIndex>0){
            root.m_pLeft = reConstrct(Arrays.copyOfRange(preOrder,1,rootinIndex+1),
                    Arrays.copyOfRange(inOrder,0,rootinIndex));
        }
        //有右孩子(遞歸)
        if(rootinIndex<inOrder.length-1){
            root.m_pRight = reConstrct(Arrays.copyOfRange(preOrder,rootinIndex+1,preOrder.length),
                    Arrays.copyOfRange(inOrder,rootinIndex+1,inOrder.length));
        }
        return root;
    }
   public static void main(String[] args) throws Exception {
       System.out.println("普通二叉树");
       int preorder1[]={1, 2, 4, 7, 3, 5, 6, 8};
       int inorder1[]={4, 7, 2, 1, 5, 3, 8, 6};
       System.out.println("根結點的值是："+ConstructTest.reConstrct(preorder1,inorder1).getM_nValue());

       System.out.println("所有结点都没有右子结点");
       int preorder2[]={1, 2, 3, 4, 5} ;
       int inorder2[]={5, 4, 3, 2, 1} ;
       System.out.println("根結點的值是："+ConstructTest.reConstrct(preorder2,inorder2).getM_nValue());

       System.out.println("输入的两个序列不匹配");
       int preorder3[] = {1, 2, 4, 5, 3, 6, 7};
       int inorder3[] = {4, 2, 8, 1, 6, 3, 7};
       System.out.println("根結點的值是："+ConstructTest.reConstrct(preorder3,inorder3));

   }
}
