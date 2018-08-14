package com.codingInterviews;

import java.util.*;

/**
 * @Description:
 * @Author:Lixiaohong_666
 * @Date:Created in 11:07 AM 3/29/2018
 */
public class Main {
    public static void main(String[] args) {
        //firstEmergy();
        StringBuffer a = new StringBuffer("Hello");
        StringBuffer b = new StringBuffer("World");
        operator(a, b);
        System.out.println(a + "," + b);
    }
    public static void operator(StringBuffer strbufa, StringBuffer strbufb) {
        strbufa.append(strbufb);
        strbufb = strbufa;
    }
    //给定一个整形数组，请写一个算法，找到第一个仅出现一次的数组元素，复杂度O(n)
    //样例输入1,1,2,2,3,3,4,4,5,6,6,8,9,9 样例输出5
    public static void findOnlyOneElment(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strs = str.split(",");
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
                if (map.containsKey(strs[i]))
                    map.put(strs[i],2);
                else
                    map.put(strs[i],1);
        }
        for(Map.Entry<String,Integer> m: map.entrySet())
            if(m.getValue()==1){
                System.out.println(m.getKey());
                break;
            }
    }
}
