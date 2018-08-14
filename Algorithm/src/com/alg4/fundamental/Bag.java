package com.alg4.fundamental;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 * @Description:揹包實現
 * 參考：算法四
 * @Author:Lixiaohong_666
 * @Date:Created in 12:18 PM 2/5/2018
 */
public class Bag<Item> implements Iterable<Item> {
    //開始結點
    private Node<Item> first;
    //揹包元素個數
    private int n;

    //節點類
    private static class Node<Item>{
        private Item item;
        private Node<Item> next;
    }
    //初始化一個空揹包
    public Bag(){
        first = null;
        n = 0;
    }
    //判斷是否爲空
    public boolean isEmpty(){
        return first == null;
    }
    //獲得大小
    public int size(){
        return n;
    }
    //添加元素到揹包（關鍵代碼）
    public void add(Item item){
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        n++;
    }
    public Iterator<Item> iterator() {
        return new ListIterator<Item>(first);
    }
    private  class ListIterator<Item> implements  Iterator<Item>{
        //當前
        private Node<Item> current;
        //構造
        public ListIterator(Node<Item> first){
            current = first;
        }
        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public Item next() {
            if(!hasNext())throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {
            //不支持刪除
            throw new UnsupportedOperationException();
        }
    }
    public static void main(String[] args) {
        /*Bag<Integer> bag = new Bag<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("F:\\IdeaProjects1\\Algorithm_DataStructure\\Algorithm\\src\\bag.txt"));
            while(scanner.hasNextInt()){
                int i = scanner.nextInt();
                //添加到揹包
                bag.add(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("揹包的大小是："+bag.size());
       *//* for(Integer integer: bag)
            System.out.println(integer);*//*
        Iterator iterator=bag.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        Bag<String> bag = new Bag<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            bag.add(item);
        }
        StdOut.println("size of bag = " + bag.size());
        for (String s : bag) {
            StdOut.println(s);
        }
    }
}
