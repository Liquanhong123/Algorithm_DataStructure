package com.others.avltree;

/**
 * @Description：二叉平衡查找樹
 * @Author： thtrt
 * @Createdate： 1/16/2018 11:37 AM
 */
public class AvlTree<AnyType extends Comparable<? super AnyType>> {
    private static final int ALLOWED_IMBALANCE = 1;
    //根結點
    private AvlNode<AnyType> root;
    //構造
    public AvlTree(){
        root = null;
    }

    //主方法：用於測試
    public static void main(String[] args) {
        AvlTree<Integer> t = new AvlTree<>( );
        for(int i=0;i<20;i++){
            t.insert(i);
        }
        t.remove(8,t.root);
        t.printTree();
    }

    //插入
    public void insert(AnyType x){
        root = insert(x,root);
    }

    private AvlNode<AnyType> insert(AnyType x, AvlNode<AnyType> root) {
        if(root == null){
            return new AvlNode<AnyType>(x,null,null);
        }
        int compareResult = x.compareTo(root.element);
        if(compareResult<0)
            root.left = insert(x,root.left);
        else if(compareResult>0)
            root.right = insert(x,root.right);
        else ;//duplicate,do nothing
        return balance(root);
    }
    //刪除
    private AvlNode<AnyType> remove(AnyType x,AvlNode<AnyType> t){
        if(t == null)
            return t;
        int compareResult = x.compareTo(t.element);
        if(compareResult<0)
            t.left = remove(x,t.left);
        else if(compareResult>0)
            t.right = remove(x,t.right);
        else if(t.left!=null&&t.right!=null){//有兩個孩子
            t.element = findMin(t.right).element;
            t.right = remove(t.element,t.right);
        }
        else
            t = (t.left!=null)?t.left:t.right;
        return balance(t);
    }

    private AnyType findMin() throws Exception {
        if( isEmpty( ) )
            throw new Exception("下溢!");
        return findMin(root).element;
    }

    private boolean isEmpty() {
        return root == null;
    }

    private AvlNode<AnyType> findMin( AvlNode<AnyType> t )
    {
        if( t == null )
            return t;

        while( t.left != null )
            t = t.left;
        return t;
    }
    //打印
    public void printTree(){
        if(isEmpty())
            System.out.println("空樹!");
        else printTree(root);
    }
    //有序打印(中序遍歷)
    private void printTree(AvlNode<AnyType> root) {
        if(root!=null){
            printTree(root.left);
            System.out.println(root.element);
            printTree(root.right);
        }
    }
    //是否含有某個元素
    private boolean contains(AnyType x,AvlNode<AnyType> t){
        while(t!=null){
            int compareResult = x.compareTo(t.element);
            if(compareResult<0){
                t  = t.left;
            }else if(compareResult>0){
                t = t.right;
            }else{//找到了
                return true;
            }
        }
        //沒找到
        return false;
    }
    public boolean contains(AnyType x){
        return contains(x,root);
    }
    //製null
    public void makeEmpty(){
        root = null;
    }
    //檢查平衡
    public void checkBalance( )
    {
        checkBalance( root );
    }
    private int checkBalance( AvlNode<AnyType> t )
    {
        if( t == null )
            return -1;

        if( t != null )
        {
            int hl = checkBalance( t.left );
            int hr = checkBalance( t.right );
            if( Math.abs( height( t.left ) - height( t.right ) ) > 1 ||
                    height( t.left ) != hl || height( t.right ) != hr )
                System.out.println( "OOPS!!" );
        }

        return height( t );
    }
    //Assume t is either balanced or within one of being balanced
    private AvlNode<AnyType> balance(AvlNode<AnyType> root) {
        if(root==null)
            return  root;
        if(height(root.left) - height(root.right)>ALLOWED_IMBALANCE)
            if(height(root.left.left)>=height(root.left.right))
                root = rotateWithLeftChild(root);
            else
                root = doubleWithLeftChild(root);
        else if(height(root.right)-height(root.left)>ALLOWED_IMBALANCE)
            if(height(root.right.right)>=height(root.right.left))
                root = rotateWithRightChild(root);
            else
                root = doubleWithRightChild(root);
        root.height = Math.max(height(root.left),height(root.right))+1;
        return root;
    }
    //書中的第三種情況，RL型(不是很明白)
    private AvlNode<AnyType> doubleWithRightChild(AvlNode<AnyType> k1) {
        k1.right = rotateWithLeftChild( k1.right );
        return rotateWithRightChild( k1 );
    }
    //書中的第四種情況，RR型
    private AvlNode<AnyType> rotateWithRightChild(AvlNode<AnyType> k1) {
        AvlNode<AnyType> k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        k1.height = Math.max(height(k1.left),height(k1.right))+1;
        k2.height = Math.max(k1.height,height(k2.right))+1;
        return k2;
    }
    //書中的第二種情況,LR型（不是很明白）
    //02.10再看就明白了
    private AvlNode<AnyType> doubleWithLeftChild(AvlNode<AnyType> k3) {
        /*AvlNode<AnyType> k1 = k3.left;
        AvlNode<AnyType> k2 = k1.right;

        k3.left = k2.right;
        k1.right = k2.left;
        k2.left = k1;
        k2.right = k3;*/
        k3.left = rotateWithRightChild( k3.left );
        return rotateWithLeftChild( k3 );
    }
    //書中的第一種情況，LL型
    private AvlNode<AnyType> rotateWithLeftChild(AvlNode<AnyType> k2) {
        AvlNode<AnyType> k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        k2.height = Math.max(height(k2.left),height(k2.right))+1;
        k1.height = Math.max(height(k1.left),k2.height)+1;
        return k1;
    }

    //求高度
    private int height(AvlNode<AnyType> t){
        return t == null?-1:t.height;
    }
    //結點類
    private static class AvlNode<AnyType>{
        //數據域
        AnyType  element;
        //左子樹
        AvlNode<AnyType> left;
        //右子樹
        AvlNode<AnyType> right;
        //高度
        int height;

        //構造
        AvlNode(AnyType theElement){
            this(theElement,null,null);
        }
        public AvlNode(AnyType element, AvlNode<AnyType> left, AvlNode<AnyType> right) {
            this.element = element;
            this.left = left;
            this.right = right;
            height = 0;
        }
    }
}
