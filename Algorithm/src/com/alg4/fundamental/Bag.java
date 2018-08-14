package com.alg4.fundamental;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 * @Description:�d�����F
 * �������㷨��
 * @Author:Lixiaohong_666
 * @Date:Created in 12:18 PM 2/5/2018
 */
public class Bag<Item> implements Iterable<Item> {
    //�_ʼ�Y�c
    private Node<Item> first;
    //�d��Ԫ�؂���
    private int n;

    //���c�
    private static class Node<Item>{
        private Item item;
        private Node<Item> next;
    }
    //��ʼ��һ���Փd��
    public Bag(){
        first = null;
        n = 0;
    }
    //�Д��Ƿ񠑿�
    public boolean isEmpty(){
        return first == null;
    }
    //�@�ô�С
    public int size(){
        return n;
    }
    //���Ԫ�ص��d�����P�I���a��
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
        //��ǰ
        private Node<Item> current;
        //����
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
            //��֧�քh��
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
                //��ӵ��d��
                bag.add(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("�d���Ĵ�С�ǣ�"+bag.size());
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
