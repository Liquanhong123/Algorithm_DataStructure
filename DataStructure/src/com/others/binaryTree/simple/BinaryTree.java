package com.others.binaryTree.simple;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @Description：簡易的二叉樹實現,主要是各種遍歷
 * 參考連接：http://www.cnblogs.com/hapjin/p/4463868.html
 * @Author： Lixiaohong_666
 * @Createdate： 1/18/2018 4:19 PM
 */
public class BinaryTree<E> {
    //結點類。靜態內部類不能訪問外部類的非靜態成員
    public static class TreeNode{
        //數據域
        Object data;
        //左孩子
        TreeNode left;
        TreeNode right;
        public TreeNode(){

        }
        //構造
        public TreeNode(Object data){
            this.data = data;
        }
        //构造一个新节点，该节点以left节点为其左孩子，right节点为其右孩子
        public TreeNode(Object data, TreeNode left, TreeNode right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    //二叉樹的根結點
    private TreeNode root;

    public BinaryTree(){
        this.root = new TreeNode();
    }
    public BinaryTree(E data){
        this.root = new TreeNode(data);
    }
    //为指定的结点添加子结点,为什么要有addNode方法？因为给定一系列的结点，通过调用该方法来构造成一颗树
    public TreeNode addNode(TreeNode parent,E data,boolean isLeft){
        if(parent == null)
            throw new RuntimeException("父节点为空，无法添加子结点");
        if(isLeft && parent.left != null)
            throw new RuntimeException("节点已经左子节点，添加失败");
        if(!isLeft && parent.right != null)
            throw new RuntimeException("节点已经有右子节点，添加失败");
        TreeNode newNode = new TreeNode(data);
        if(isLeft)
            parent.left = newNode;
        else
            parent.right = newNode;
        return newNode;
    }
    public boolean isEmpty(){
        //這有點問題
        return root.data == null;
    }
    //返回根結點
    public TreeNode root(){
        if(isEmpty())
            throw new RuntimeException("树空，无法访问根结点");
        return root;
    }
    public E parent(TreeNode node){
        return null;//采用二叉树链表存储时，访问父结点需要遍历整棵二叉树。所以这里不实现
    }
    //访问指定节点的左结点，返回的是其左孩子的数据域
    public E leftChild(TreeNode parent){
        if(parent == null)
            throw new RuntimeException("空結點不能訪問其左孩子");
        return parent.left == null ? null : (E)parent.left.data;
    }
    public E rightChild(TreeNode parent){
        if(parent == null)
            throw new RuntimeException("空结点不能访问其右孩子");
        return parent.right == null ? null : (E)parent.right.data;
    }
    //樹的高度
    public int getHeight(){
        return getHeight(root);
    }
    private int getHeight(TreeNode node) {
        if(node == null)
            return 0;
        else if(node.left == null && node.right == null)
            return 1;
        else{
            int leftHeight = getHeight(node.left);
            int rightHeight = getHeight(node.right);
            int max = leftHeight>rightHeight?leftHeight:rightHeight;
            return max+1;
        }
    }
    //先序遍歷：返回一個list(樹中的結點以先序的方式存放在該list中)
    //注意：addAll()的用法
    public List<TreeNode> preTraverse(){
        return preOrderTraverse(root);
    }

    private List<TreeNode> preOrderTraverse(TreeNode node) {
        List<TreeNode> list = new ArrayList<>();
        list.add(node);
        if(node.left!=null)
            list.addAll(preOrderTraverse(node.left));
        if(node.right!=null)
            list.addAll(preOrderTraverse(node.right));
        return list;
    }
    //中序遍历
    public List<TreeNode> inTraverse(){
        return inOrderTraverse(root);
    }
    private List<TreeNode> inOrderTraverse(TreeNode node){
        List<TreeNode> list = new ArrayList<TreeNode>();
        if(node.left != null)
            list.addAll(inOrderTraverse(node.left));
        list.add(node);
        if(node.right != null)
            list.addAll(inOrderTraverse(node.right));
        return list;
    }

    //后序遍历
   public List<TreeNode> postTraverse(){
        return  post_Traverse(root);
   }

    private List<TreeNode> post_Traverse(TreeNode root) {
       List<TreeNode> list = new ArrayList<>();
       if(root.left!=null)
           list.addAll(post_Traverse(root.left));
       if(root.right!=null)
           list.addAll(post_Traverse(root.right));
       list.add(root);
       return list;
    }

    //層序遍歷
    public List<TreeNode> levelTraverse(){
       return level_Traverse(root);
    }

    private List<TreeNode> level_Traverse(TreeNode root) {
       Queue<TreeNode> queue = new ArrayDeque<>();
       List<TreeNode> list = new ArrayList<>();
       if(root!=null)//先将根结点入队列
           queue.add(root);
       while(!queue.isEmpty()){//队列不空时，说明遍历还未结束，結束循環說明讀完了最後一層
           //将队头元素添加到list中,然後出隊
            list.add(queue.peek());
            TreeNode p = queue.poll();

            if(p.left!=null)
                queue.add(p.left);
            if(p.right!=null)
                queue.add(p.right);
       }
       return list;
    }
}
