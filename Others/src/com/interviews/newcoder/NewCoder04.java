package com.interviews.newcoder;

import java.util.Scanner;

/**
 * @Description:
 * @Author:Lixiaohong_666
 * @Date:Created in 8:28 PM 3/27/2018
 */
public class NewCoder04 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;
        int x,y;
        for(x=0;x<=n;x++){
            for(y=1;y<=n;y++){
                if(x%y>=k)
                    count++;
            }
        }
        System.out.println(count);
    }
}
