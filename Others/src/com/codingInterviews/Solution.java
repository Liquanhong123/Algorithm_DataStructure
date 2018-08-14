package com.codingInterviews;

/**
 * @Description:牛客網的編程題目解決
 * @Author:Lixiaohong_666
 * @Date:Created in 2:19 PM 3/23/2018
 */
public class Solution {
    public static void main(String[] args) {
        int[][] array = {{23,25,28,28,90},{45,65,66,67,78},{75,76,77,79,80},{85,86,87,88,89},{91,93,95,97,98}};
        System.out.println(Find(array,94));
    }
    //題目描述：在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
    //思路1：把每一行看成是有序遞增的數組，利用二分查找，通過遍歷每一行得到答案，時間複雜度nlogn
    //注意二維數組中array.length是獲取的[行長度],array[i].length[列長度]
    public static boolean Find(int[][] array,int target){

        for(int i=0;i<array.length;i++){
            int low  = 0;
            int high = array[i].length-1;
            while(low<=high){
                int mid = (low+high)/2;
                if(target<array[i][mid])
                    high = mid-1;
                else  if(target>array[i][mid])
                    low = mid+1;
                else //相等
                    return true;
            }
        }
            return false;
    }
}
