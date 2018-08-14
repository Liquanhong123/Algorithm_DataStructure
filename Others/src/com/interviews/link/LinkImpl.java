package com.interviews.link;

/**
 * @Description：鏈表的一個具體實現
 * @Author： thtrt
 * @Createdate： 1/18/2018 8:20 PM
 */
public class LinkImpl implements Link {
    private int foot = 0;
    private int len;
    //根結點
    private Node root;
    //對象數組
    private Object retdata[];
    //結點類
    class Node{
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }
        //添加結點
        public void addNode(Node newNode){
            if(this.next == null)
                this.next = newNode;
            else
                this.next.addNode(newNode);
        }
        //刪除結點
        public void deleteNode(Node previous,Object data){
            if(this.data.equals(data)){
                previous.next = this.next;
            }else{
                if(this.next!=null){
                    this.next.deleteNode(this,data);
                }
            }
        }
        public void getAll() {
            retdata[foot++] = this.data; //取出当前节点中的数据
            if (this.next != null) {
                this.next.getAll();
            }
        }
    }
    @Override
    public void add(Object data) {
        if(data!=null){
            //保存個數
            len++;
            Node newNode = new Node(data);
            if(this.root== null)
                this.root = newNode;
            else
                this.root.addNode(newNode);
        }
    }

    @Override
    public void add(Object[] data) {
        for(int x = 0; x < data.length; x++){
            this.add(data[x]);
        }
    }

    @Override
    public void delete(Object data) {
        if(this.exists(data)){//如果存在，則執行刪除
            if(this.root.equals(data))
                this.root = this.root.next;
            else
                this.root.next.deleteNode(this.root,data);
        }
    }
    //判斷數據是否存在
    @Override
    public boolean exists(Object data) {
        if (data == null)
            return false;
        if (this.root == null)
            return false;
        //取得全部數據
        Object[] d = this.getAll();
        boolean flag = false;
        for(int x=0;x<d.length;x++){
            if(data.equals(d[x])){
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Override
    public Object[] getAll() {
        this.foot = 0;
        if(this.len!=0){
            this.retdata = new Object[this.len];
            //結點類中的getAll()
            this.root.getAll();
            return this.retdata;
        }else{
            return null;
        }
    }

    @Override
    public Object get(int index) {
        Object[] d = this.getAll();
        if(index<d.length)
            return d[index];
        else
        return null;
    }

    @Override
    public int length() {
        return this.len;
    }
}
