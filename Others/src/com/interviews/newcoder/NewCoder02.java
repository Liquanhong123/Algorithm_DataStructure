package com.interviews.newcoder;

import java.util.Scanner;

/**
 * @Description:输入年、月、日，計算該天是這一年中的第幾天
 * @Author:Lixiaohong_666
 * @Date:Created in 4:00 PM 3/16/2018
 */
public class NewCoder02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int y = scanner.nextInt();
            int m = scanner.nextInt();
            int d = scanner.nextInt();
            int[] a = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
            int[] b = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};

            int count = 0;
            if(isLeap(y)){
                for(int i=0;i<m-1;i++)
                    count += b[i];
            }else{
                for(int i=0;i<m-1;i++)
                    count += a[i];
            }
            count += d;
            System.out.println(count);
        }
    }
    public static boolean isLeap(int y){
        if(y%4==0&&y%100!=0||y%400==0)
            return true;
        else
            return false;
    }
}


