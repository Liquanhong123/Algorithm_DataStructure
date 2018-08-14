package com.codingInterviews;

import java.util.Arrays;

/**
 * @Description:字符串的排列:输入一个字符串，打印出该字符串中字符的所有排列。例如输入字符串abc，则打印出由字符a、b、c所能排列出来的所有字符串abc、acb、bac、bca、cab、cba
 * @Author:Lixiaohong_666
 * @Date:Created in 11:49 AM 3/21/2018
 */
public class StringPermutation {
    public static void permutation_1(char[] pStr){
        if (pStr == null || pStr.length == 0)
            return;
        permutation_2(pStr, 0,pStr.length-1);
    }
    public static void permutation_2(char[] buf, int start, int end) {
        if (start == end) {// 当只要求对数组中一个字母进行全排列时，只要就按该数组输出即可
            for (int i = 0; i <= end; i++) {
                System.out.print(buf[i]);
            }
            System.out.println();
        } else {// 多个字母全排列
            for (int i = start; i <= end; i++) {
                char temp = buf[start];// 交换数组第一个元素与后续的元素
                buf[start] = buf[i];
                buf[i] = temp;
                permutation_2(buf, start + 1, end);// 后续元素递归全排列
                temp = buf[start];// 将交换后的数组还原
                buf[start] = buf[i];
                buf[i] = temp;
            }
        }
    }
    public static void Test(char[] pStr)
    {
        if(pStr == null)
            System.out.println("Test for NULL begins:");
        else
            System.out.println("Test for " + Arrays.toString(pStr) + " begins:");
        permutation_1(pStr);
        System.out.println();
    }
    public static void main(String[] args){
        Test(null);
        String string01 = "";
        char string1[] = string01.toCharArray();
        Test(string1);
        String string02 = "a";
        char string2[] = string02.toCharArray();
        Test(string2);
        String string03 = "ab";
        char string3[] = string03.toCharArray();
        Test(string3);
        String string04 = "abc";
        char string4[] = string04.toCharArray();
        Test(string4);
    }
}
