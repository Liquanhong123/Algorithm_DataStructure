package com.interviews.test;

import java.util.Scanner;

/**
 * @Description:字符串面试题1：所有的*都放在开头
 *              有两种方法1、partition  2、倒着复制
 * @Author:Lixiaohong_666
 * @Date:Created in 5:04 PM 3/29/2018
 */
public class String1 {
    public static void main(String[] args) {
        char[] chars = new char[]{'1','*','*','3','*','4'};
        putToStart2(chars);
        //putToStart1(chars);
    }
    //倒着复制-数字相对顺序不会变
    public static void putToStart1(char[] chars){
        int j = chars.length-1;
        for(int i=chars.length-1;i>=0;--i)
            if(chars[i]>47&&chars[i]<58)//是数字
                chars[j--]=chars[i];
        for(;j>=0;--j)
            chars[j]='*';
        System.out.println("所有的*都放在开头后...");
        for (char c: chars)
            System.out.print(c+" ");
    }
    //快排partition-数字相对顺序不会变
    public static void putToStart2(char[] chars){
        for(int i=chars.length-1,j=chars.length-1;j>0;--j)
            if (chars[j]=='*'){//交换i、j的对应值,并且i自增
                char tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;
                i--;
            }
        System.out.println("法二...");
        for (char c: chars)
            System.out.print(c+" ");
    }
}
