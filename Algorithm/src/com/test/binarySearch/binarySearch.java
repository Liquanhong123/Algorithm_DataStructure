package com.test.binarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int[] srcArray = {12,23,35,45,98};
        System.out.println(binarySearch(srcArray,98));
    }
    //二分查找算法：沒找到返回-1
    public static  int binarySearch(int[] srcArray,int des){
        int low=0;
        int high = srcArray.length - 1;
        while(low<=high){
            int middle = (low+high)/2;
            if(des == srcArray[middle]){
                return middle;
            }else if(des<srcArray[middle]){
                high = middle - 1;
            }else{
                low = middle + 1;
            }
        }
        return -1;
    }
}
