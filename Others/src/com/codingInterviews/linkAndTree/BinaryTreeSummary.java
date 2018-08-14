package com.codingInterviews.linkAndTree;

import com.designPattern.Composite.Tree;

import java.util.*;

/**
 * @Description:Java搞定面試中的二叉樹題目 參考鏈接：https://blog.csdn.net/fightforyourdream/article/details/16843303
 * @Author:Lixiaohong_666
 * @Date:Created in 11:21 AM 3/26/2018
 */
public class BinaryTreeSummary {
    /*      10
          /    \
        20     30
      /   \    /
    40    50  60
     */
    public static void main(String[] args) {
        TreeNode r1 = new TreeNode(10);
        TreeNode r2 = new TreeNode(20);
        TreeNode r3 = new TreeNode(30);
        TreeNode r4 = new TreeNode(40);
        TreeNode r5 = new TreeNode(50);
        TreeNode r6 = new TreeNode(60);
        r1.left = r2;
        r1.right = r3;
        r2.left = r4;
        r2.right = r5;
        r3.left = r6;
        //求二叉樹結點個數
        //System.out.println(BinaryTreeSummary.getNodeNumbersRec(r1));
        //System.out.println(BinaryTreeSummary.getNodeNumbers(r1));
        //求二叉樹的高度
        //System.out.println(BinaryTreeSummary.getDepthRec(r1));
        //System.out.println(BinaryTreeSummary.getDepth(r1));
        //層序遍歷
        /*List<TreeNode> lists = BinaryTreeSummary.LevelOrderTraversal(r1);
        for(TreeNode treeNode: lists)
            System.out.print(treeNode.val+" ");*/
        //後序遍歷
        /*List<TreeNode> lists = BinaryTreeSummary.PostOrderTraversal(r1);
        for(TreeNode treeNode: lists)
            System.out.print(treeNode.val+" ");*/
        //BinaryTreeSummary.PostOrderTraversal(r1);
        //中序遍歷
        /*List<TreeNode> lists = BinaryTreeSummary.InOrderTraversalRec(r1);
        for(TreeNode treeNode: lists)
            System.out.print(treeNode.val+" ");*/
        //BinaryTreeSummary.InOrderTraversal(r1);
        //前序遍歷
        //BinaryTreeSummary.PreOrderTraversalRec(r1);
        //BinaryTreeSummary.PreOrderTraversal(r1);

        //BST轉DLL
        /*TreeNode root=BinaryTreeSummary.convertBST2DLL(r1);
        while (true){
            if(root==null)
                break;
            System.out.print(root.val+" ");
            if (root.right!=null)
                root = root.right;
            else
                break;
        }*/
        //求二叉树第K层的节点个数
        //System.out.println(BinaryTreeSummary.getNodeNumKthLevelRec(r1,2));
        //System.out.println(BinaryTreeSummary.getNodeNumKthLevel(r1,3));
        //求二叉树中叶子节点的个数
        //System.out.println(BinaryTreeSummary.getNodeNumLeafRec(r1));
        //System.out.println(BinaryTreeSummary.getNodeNumLeaf(r1));
        //是否是相同的二叉樹
       // System.out.println(BinaryTreeSummary.isSameRec(r1,r1));
       //System.out.println(BinaryTreeSummary.isSame(r1,r3));
        //去哪儿网笔试：给定一棵二叉树的前序（根、左、右）和中序（左、根、右）的打印结果，输出此二叉树按层（从左往右）打印结果。
        //例如一棵二叉树前序：1 2 4 5 3；中序：4 2 5 1 3。可以构建出下图所示二叉树:自己画。层序遍历结果：1  2 3 4 5
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] pre = new int[n];
            int[] in =  new int[n];
            for(int i=0;i<n;i++)
                pre[i] = scanner.nextInt();
            for(int i=0;i<n;i++)
                in[i] = scanner.nextInt();
            //重构二叉树
            TreeNode root=BinaryTreeSummary.reConstructBinaryTree(pre,in);
            //层序遍历
            List<TreeNode> levelRoot=BinaryTreeSummary.LevelOrderTraversal(root);
            for(TreeNode t: levelRoot)
                System.out.print(t.val+",");
        }
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    //求二叉樹結點個數：遞歸解法
    public static int getNodeNumbersRec(TreeNode root) {
        if (root == null)
            return 0;
        else
            return getNodeNumbersRec(root.left) + getNodeNumbersRec(root.right) + 1;
    }

    //求二叉樹結點個數：非遞歸解法
    public static int getNodeNumbers(TreeNode root) {
        if (root == null)
            return 0;
        int count = 1;
        Queue<TreeNode> queue = new ArrayDeque<>();
        //先將根節點入隊列
        queue.add(root);

        while (!queue.isEmpty()) {//队列不空时，说明遍历还未结束，結束循環說明讀完了最後一層
            //將隊頭元素添加到list中，然後出隊
            TreeNode p = queue.remove();
            if (p.left != null) {
                queue.add(p.left);
                count++;
            }
            if (p.right != null) {
                queue.add(p.right);
                count++;
            }
        }
        return count;
    }

    //求二叉樹的高度：遞歸解法
    public static int getDepthRec(TreeNode root) {
        if (root == null)
            return 0;
        int   leftTreeNode = getDepthRec(root.left);
        int rightTreeNode = getDepthRec(root.right);
        return Math.max(leftTreeNode,rightTreeNode)+1;
    }
    //求二叉樹的高度：非遞歸解法
    public static int getDepth(TreeNode root){
        if(root == null)
            return 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        int depth  = 0;
        int currentLevelNodes = 1;// 当前層node的数量
        int nextLevelNodes = 0;//下一層node的數量
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode p = queue.remove();
            currentLevelNodes--;
            if(p.left!=null){
                queue.add(p.left);
                nextLevelNodes++;
            }
            if(p.right!=null){
                queue.add(p.right);
                nextLevelNodes++;
            }
            if(currentLevelNodes==0){
                depth++;
                currentLevelNodes = nextLevelNodes;
                nextLevelNodes=0;
            }
        }
        return depth;
    }
    //層序遍歷：返回集合
    public static List<TreeNode> LevelOrderTraversal(TreeNode root) {
        if (root == null)
            return null;
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<TreeNode> list = new ArrayList<>();
        //先將根節點入隊列
        queue.add(root);

        while (!queue.isEmpty()) {//队列不空时，说明遍历还未结束，結束循環說明讀完了最後一層
            //將隊頭元素添加到list中，然後出隊
            list.add(queue.peek());
            TreeNode p = queue.remove();

            if (p.left != null)
                queue.add(p.left);
            if (p.right != null)
                queue.add(p.right);
        }
        return list;
    }
    //後序遍歷：遞歸，返回集合
    public static List<TreeNode> PostOrderTraversalRec(TreeNode root){
        List<TreeNode> list = new ArrayList<>();
        if(root.left!=null)
            list.addAll(PostOrderTraversalRec(root.left));
        if(root.right!=null)
            list.addAll(PostOrderTraversalRec(root.right));
        list.add(root);

        return list;
    }
    //後序遍歷：迭代
    public static void PostOrderTraversal(TreeNode root){
        if(root==null)
            return;
        Stack<TreeNode> s = new Stack<>();
        Stack<TreeNode> output = new Stack<>();
        //根節點入S棧
        s.push(root);
        while(!s.isEmpty()){//确保所有元素都被push到output棧
            TreeNode current = s.pop();
            //根節點先入output棧
            output.push(current);
            if (current.left!=null)//把棧頂元素的左右孩子分別push到S棧
                s.push(current.left);
            if(current.right!=null)
                s.push(current.right);
        }
        while(!output.isEmpty()){
            System.out.print(output.pop().val+" ");
        }

    }
    //中序遍歷：遞歸，返回集合
    public static List<TreeNode> InOrderTraversalRec(TreeNode root){
        List<TreeNode> list = new ArrayList<>();
        if(root.left!=null)
            list.addAll(InOrderTraversalRec(root.left));
        list.add(root);
        if(root.right!=null)
            list.addAll(InOrderTraversalRec(root.right));
        return list;
    }
    //中序遍歷：迭代，用棧
    public static void InOrderTraversal(TreeNode root){
        if(root == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while(true){
           while(current!=null){// 先添加非空节点所有的左孩子到栈
               stack.push(current);
               current = current.left;
           }
           if(stack.isEmpty())
               break;
           // 因为此时已经没有左孩子了，所以输出栈顶元素
           current = stack.pop();
           System.out.print(current.val+" ");
           current = current.right;// 准备处理右子树
       }
    }
    //前序遍歷：直接輸出
    public  static void PreOrderTraversalRec(TreeNode root){
        if(root == null)
            return;
        System.out.print(root.val+" ");
        if(root.left!=null)
            PreOrderTraversalRec(root.left);
        if(root.right!=null)
            PreOrderTraversalRec(root.right);
    }
    //前序遍歷：迭代
    public static void PreOrderTraversal(TreeNode root){
        if(root == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (true){
            if(stack.isEmpty())
                break;
            TreeNode current = stack.pop();//出栈栈顶元素
            System.out.print(current.val+" ");
            // 关键点：要先压入右孩子，再压入左孩子，这样在出栈时会先打印左孩子再打印右孩子
            if(current.right!=null) stack.push(current.right);
            if(current.left!=null) stack.push(current.left);
        }
    }
    //Binary sort tree              Doubly Linked list
    // 將二叉查找樹BST轉換爲雙向鏈表DLL：迭代解法
    public static TreeNode convertBST2DLL(TreeNode root){
        if (root==null)
            return null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;//指向當前處理結點
        TreeNode old = null;//指向前一個處理結點
        TreeNode head = null;//新鏈表頭
        while(true){
            while(current!=null){ // 先添加非空节点所有的左孩子到栈
               stack.push(current);
               current = current.left;
            }
            if(stack.isEmpty())
                break;
            //因爲此時已經沒有左孩子了，輸出棧頂元素
            current = stack.pop();
            if(head == null){       // /第一个节点为双向链表头节点
                head = current;
            }
            if(old!=null){
                old.right = current;
            }
            old = current;//更新old
            current = current.right;//準備處理右子樹
        }
        return head;
    }
    //求二叉樹第K層結點個數：遞歸解法
    public static int getNodeNumKthLevelRec(TreeNode root,int k){
        if(root==null||k<1)
            return 0;
        if(k==1)
            return 1;
        //左右子樹的第K-1層結點數目
        int leftNumbers = getNodeNumKthLevelRec(root.left,k-1);
        int rightNumbers = getNodeNumKthLevelRec(root.right,k-1);
        return leftNumbers+rightNumbers;
    }
    //求二叉樹第K層結點個數：迭代法，參考哦getDepth
    public static int getNodeNumKthLevel(TreeNode root,int k){
        if(root == null)
            return  0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        int i=1;
        int currentLevelNodes = 1;//当前層node的数量
        int nextLevelNodes = 0;// 下一層node的数量

        while(!queue.isEmpty()&&i<k){//i=k跳出循環，即找到第K層...
            TreeNode current = queue.remove();//從隊頭位置移除
            currentLevelNodes--;//減少當前層node的數量
            //如果有左右孩子，加入隊列，並增加下一層node的數量
            if(current.left!=null){
                queue.add(current.left);
                nextLevelNodes++;
            }
            if(current.right!=null){
                queue.add(current.right);
                nextLevelNodes++;
            }
            if(currentLevelNodes==0){
                currentLevelNodes = nextLevelNodes;
                nextLevelNodes = 0;//下一層結點初始化
                i++;
            }
        }
        return currentLevelNodes;
    }
    //求二叉树中叶子节点的个数（递归）
    public static int getNodeNumLeafRec(TreeNode root){
        if(root==null)
            return 0;
        if(root.left==null&&root.right==null)
            return 1;
        return getNodeNumLeafRec(root.left)+getNodeNumLeafRec(root.right);
    }
    //求二叉树中叶子节点的个数(迭代)，基於LevelOrderTraversal
    public static int getNodeNumLeaf(TreeNode root){
        if(root==null)
            return 0;
        if(root.left==null&&root.right==null)
            return 1;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int numLeafs = 0;

        while (!queue.isEmpty()){
            TreeNode p = queue.remove();
            if(p.left!=null)
                queue.add(p.left);
            if(p.right!=null)
                queue.add(p.right);
            if(p.left==null&&p.right==null)//葉子結點
                numLeafs++;
        }
        return  numLeafs;
    }
    /**
     * 判断两棵二叉树是否相同的树，递归解法：
     * （1）如果两棵二叉树都为空，返回真
     * （2）如果两棵二叉树一棵为空，另一棵不为空，返回假
     * （3）如果两棵二叉树都不为空，如果对应的左子树和右子树都同构返回真，其他返回假
     */
    public static boolean isSameRec(TreeNode r1,TreeNode r2){
        if(r1==null&&r2==null)
            return true;
        if((r1==null&&r2!=null)||(r2==null&&r1!=null))
            return false;
        if(r1.val!=r2.val)
            return false;

        boolean leftSameRec = isSameRec(r1.left,r2.left);
        boolean rightSameRec = isSameRec(r1.right,r2.right);
        return leftSameRec&&rightSameRec;
    }
    //判断两棵二叉树是否相同的树，迭代解法：遍歷一遍即可，這裏用preOrder
    public static  boolean isSame(TreeNode r1,TreeNode r2){
        if(r1==null&&r2==null)
            return true;
        if((r1==null&&r2!=null)||(r2==null&&r1!=null))
            return false;
        if(r1.val!=r2.val)
            return false;
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();

        s1.push(r1);
        s2.push(r2);

        while(!s1.isEmpty() && !s2.isEmpty()){
            TreeNode n1 = s1.pop();
            TreeNode n2 = s2.pop();
            if(n1==null && n2==null){
                continue;
            }else if(n1!=null && n2!=null && n1.val==n2.val){
                s1.push(n1.right);
                s1.push(n1.left);

                s2.push(n2.right);
                s2.push(n2.left);
            }else{
                return false;
            }
        }
        return true;
    }
    //重构二叉树
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = null;
        int[] leftInorder;
        int[] rightInorder;
        int inorderPos=0;//在中序序列中拆分

        int[] leftPreorder;
        int[] rightPreorder;
        int preorderPos=0;//在先序序列中拆分
        if((pre.length!=0)&&(in.length!=0)){
            //把第一个节点作为root
            root = new TreeNode(pre[0]);

            // 查找先序序列第一個元素的值在中序序列中的位置
            for(int i=0;i<in.length;i++){
                if(in[i]==pre[0]){
                    inorderPos = i;
                    break;
                }
            }
            //根据root节点把pre,in划分为root左侧和右侧两个区域,
            leftInorder = Arrays.copyOfRange(in,0,inorderPos);
            rightInorder = Arrays.copyOfRange(in,inorderPos+1,in.length);

            preorderPos = leftInorder.length;
            leftPreorder = Arrays.copyOfRange(pre,1,preorderPos+1);
            rightPreorder = Arrays.copyOfRange(pre,preorderPos+1,pre.length);

            root.left  = reConstructBinaryTree(leftPreorder,leftInorder);
            root.right = reConstructBinaryTree(rightPreorder,rightInorder);
        }
        return root;
    }
}
