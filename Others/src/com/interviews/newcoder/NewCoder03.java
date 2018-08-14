package com.interviews.newcoder;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @Description:输出一行一个数字表示完成所有料理需要多少种不同的材料。
 *  輸入：
 *  BUTTER FLOUR
    HONEY FLOUR EGG
    輸出：
    4
 * @Author:Lixiaohong_666
 * @Date:Created in 11:22 AM 3/17/2018
 */
public class NewCoder03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            String[] arr = str.split(" ");
            for(int i=0;i<arr.length;i++)
                set.add(arr[i]);
        }
        System.out.println(set.size());
        set.clear();
    }
}
