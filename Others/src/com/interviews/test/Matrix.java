package com.interviews.test;

import java.util.Scanner;

/**
 * @Description:順時針90度旋轉矩陣
 * @Author:Lixiaohong_666
 * @Date:Created in 8:12 PM 3/29/2018
 */
public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            /*int N1 = scanner.nextInt();
            int[][] matrix = new int[N1][N1];
            for(int i=0;i<N1;i++){
                for(int j=0;j<N1;j++){
                    matrix[i][j] = scanner.nextInt();
                }
            }*/
            String line = scanner.nextLine();
            String[] strs=line.split(" ");
            int N1 = strs.length;//注意是，拆分后的
            int[][] matrix = new int[N1][N1];
            for(int i=0;i<N1;i++)//第一行
                matrix[0][i] = Integer.parseInt(strs[i]);
            for (int i=1;i<N1;i++) {//第二行以后,一个一个读
                for(int j=0;j<N1;j++)
                    matrix[i][j] = scanner.nextInt();
            }
            //旋转并输出
            int[][] tmp=rotate(matrix);
            for(int a=0;a<tmp.length;a++){
                for(int b=0;b<tmp[0].length;b++)
                    System.out.print(tmp[a][b]+" ");
                System.out.println();
            }
        }
    }
    public static int[][] rotate(int [][]matrix){
        int n0 = matrix[0].length;
        int n1 = matrix.length;
        int[][]tmp=new int[n0][n1];
        int dst=n1-1;
        for(int i=0;i<n1;i++,dst--){
            for(int j=0;j<n0;j++){
                   tmp[j][dst]=matrix[i][j];
             }
        }
        return tmp;
    }
}
