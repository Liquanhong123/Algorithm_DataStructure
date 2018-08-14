package com.codingInterviews.linkAndTree;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 鏈表部分面試題
 * 	 1、单链表的创建和遍历
 　　2、求单链表中节点的个数
 　　3、查找单链表中的倒数第k个结点（剑指offer，题15）
 　　4、查找单链表中的中间结点
 　　5、合并两个有序的单链表，合并之后的链表依然有序【出现频率高】（剑指offer，题17）
 　　6、单链表的反转【出现频率最高】（剑指offer，题16）
 　　7、从尾到头打印单链表（剑指offer，题5）
     8、在一個排序鏈表中，刪除鏈表中的重複節點。例如链表1->2->3->3->4->4->5 处理后为 1->2->5
 *參考：http://www.cnblogs.com/smyhvae/p/4782595.html
 */
public class LinkList {
	public Node head;
	private Node current;
	private int size;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList list = new LinkList();
		//添加數據
		for(int i=0;i<13;i++){
			list.add(i);
		}
		//list.print(list.head);
		//System.out.println("getLength："+list.getLength(list.head));
		//System.out.println("倒數第K個結點數據是："+list.findLastNode1(list.head,14).data);

		//合并两个有序的单链表，合并之后的链表依然有序
		/*LinkList linkList1 = new LinkList();//1、3、5
		LinkList linkList2 = new LinkList();//2、4、6
		linkList1.add(1);linkList1.add(3);linkList1.add(5);
		linkList2.add(2);linkList2.add(4);linkList2.add(5);linkList2.add(6);

		LinkList list3 = new LinkList();
		list3.head = list3.mergeLinkList(linkList1.head, linkList2.head);
		list3.print(list3.head);*/

		//單鏈表的反轉
		/*LinkList linkList4 = new LinkList();
		linkList4.head = list.reverseList(list.head);
		linkList4.print(linkList4.head);*/
		//從尾到頭打印單鏈表
		//list.reversePrint(list.head);

		//8、在一個排序鏈表中，刪除鏈表中的重複節點
		LinkList linkList8 = new LinkList();//1->2->3->3->4->4->5
		linkList8.add(1);linkList8.add(2);linkList8.add(3);linkList8.add(3);
		linkList8.add(4);linkList8.add(4);linkList8.add(5);
		LinkList tmp = new LinkList();
		tmp.head = deleteDuplication(linkList8.head);
		tmp.print(tmp.head);
	}
	//8、在一個排序鏈表中，刪除鏈表中的重複節點。：遞歸解法
	public static Node deleteDuplication(Node pHead){
		if(pHead==null||pHead.next==null)//只有0或者1個結點
			return  pHead;
		if(pHead.data == pHead.next.data){//當前結點是重複結點
			Node nextPivot = pHead.next;
			while(nextPivot!=null&&nextPivot.data == pHead.data)
				// 跳过值与当前结点相同的全部结点,找到第一个与当前结点不同的结点
				nextPivot = nextPivot.next;
			// 从第一个与当前结点不同的结点开始递归
			return deleteDuplication(nextPivot);
		}else{//當前結點不是重複結點
			pHead.next = deleteDuplication(pHead.next);// 保留当前结点，从下一个结点开始递归
			return pHead;
		}
	}
	//從尾到頭打印單鏈表
	//思路：用棧或者遞歸
	public void reversePrint(Node head){
		if(head ==null){
			return;
		}
		Stack<Node> stack = new Stack<Node>();
		Node current = head;

		while(current !=null){
			stack.push(current);
			current = current.next;
		}
		while(stack.size()>0){
			System.out.println(stack.pop().data);
		}
	}

	//单链表的反转
	public Node reverseList(Node head){
		if(head == null || head.next == null){
			return head;
		}
		Node current = head;
		Node next = null;//定义当前结点的下一个结点
		Node reverseHead = null;//反转后新链表的表头

		while(current!=null){
			//暫時保存當前結點的下一個結點,因爲下一次要用
			next = current.next;

			//關鍵代碼
			//將current的下一個結點(相當於C語言中的指針,Debug好好理解)指向新鏈表的頭結點
			current.next = reverseHead;
			reverseHead = current;

			//操作結束,current結點後移
			current = next;
		}
		return reverseHead;
	}

	//合并两个有序的单链表，合并之后的链表依然有序
	//通過這個案列幾乎徹底明白了Java中的“指針”(當作賦值的話不好理解，會搞暈自己的)，head開始是指向head1(head1.data小的話)，然後通過current去遍歷head1和head2，
	// head是一直指向這個新鏈表的，畫圖、Debug就很容易理解了
	public Node mergeLinkList(Node head1,Node head2){
		if(head1==null&&head2==null)
			return null;
		if(head1==null)
			return head2;
		if(head2==null)
			return  head1;
		//新鏈表的頭結點
		Node head;
		//指向新鏈表(動態的)
		Node current;
		// 一开始，我们让head和current指向head1和head2中较小的数据，head1指針後移
		//current再去head1和head2中尋找
		if(head1.data<head2.data){
			head    = head1;
			current = head1;
			head1 = head1.next;
		}else{
			head  = head2;
			current = head2;
			head2 = head2.next;
		}
		while((head1!=null)&&(head2!=null)){
			if(head1.data<head2.data){
				current.next = head1;
				current = current.next;
				head1 = head1.next;
			}else{
				current.next = head2;
				current = current.next;
				head2 = head2.next;
			}
		}
		//合併剩餘元素
		if(head1!=null){
			current.next = head1;
		}
		if (head2!=null)
			current.next = head2;
		return head;
	}

	//輸出單鏈表倒數第K個結點(法2) 思路:声明两个指针：即两个结点型的变量first和second，首先让first和second都指向第一个结点，然后让second结点往后挪k-1个位置，此时first和second就间隔了k-1个位置，然后整体向后移动这两个节点，直到second节点走到最后一个结点的时候，
	//此时first节点所指向的位置就是倒数第k个节点的位置。时间复杂度为O（n）
	public Node findLastNode1(Node head,int K){
		if(K==0||head==null){
			return null;
		}
		Node first = head;
		Node second = head;
		for(int i=0;i<K;i++){
			second = second.next;
			if(second==null){//說明K的值大於鏈表的長度
				return null;
			}
		}
		while(second!=null){
			first = first.next;
			second = second.next;
		}
		return first;
	}

	//輸出單鏈表倒數第K個結點(法1)
	public int findLastNode(int K){
		//第一次遍歷,得到鏈表的長度
		if(head==null){
			return -1;
		}
		current = head;
		while(current!=null){
			size++;
			current = current.next;
		}
		//第二次遍歷,輸出倒數第K個結點的數據
		current = head;
		for(int i=0;i<size-K;i++){
			current = current.next;
		}
		return current.data;
	}

	//求單鏈表結點個數
	public int getLength(Node head){
		if(head==null){
			return 0;
		}
		int length=0;
		Node current = head;
		while(current!=null){
			length++;
			current = current.next;
		}
		return length;
	}

	//添加數據
	public void add(int data){
		if(head==null){
			head = new Node(data);
			current = head;
		}else{
			current.next = new Node(data);
			current = current.next;
		}
	}
	//打印鏈表
	public void print(Node node){
		if(node==null){
			return;
		}
		current = node;
		while(current!=null){
			System.out.println(current.data);
			current = current.next;
		}
	}
	class Node{
		int data;
		Node next;
		public Node(int data){
			this.data = data;
		}
	}
}
