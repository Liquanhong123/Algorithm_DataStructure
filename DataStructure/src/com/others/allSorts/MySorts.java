package com.others.allSorts;

import java.util.Arrays;

/**
 * @Description：一些經典的排序算法
 * @Author： Lixiaohong_666
 * @Createdate： 1/14/2018 3:32 PM
 */
public class MySorts {
    //插入排序(數據結構.第三版)
    public static void insertionSort(int[]a){
       for(int i=1;i<a.length;i++){//從第二個元素開始
           int tmp=a[i];//待插入元素
           int j;//待插入位置
           for(j=i;j>0&&tmp<a[j-1];j--)
               a[j]=a[j-1];//後移
           //內循環結束說明找到了正確插入的位置
           a[j]=tmp;
       }
    }

    //冒泡排序
   public static void bubble(int[]a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++)
                if(a[i]>a[j])
                    swapReferences(a,i,j);
        }
   }
   //冒泡改進
   // 每次把最大的值"浮"到最後https://www.cnblogs.com/chengxiao/p/6103002.html;與上面的實現(所有數字和a[i]比較,貌似像選擇排序)有很大的區別
    public static void bubble1(int[]a) {
        for (int i = 0; i < a.length - 1; i++) {
            boolean flag = true;//设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已然完成。
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j] > a[j+1]) {
                    swapReferences(a, j, j+1);
                    flag = false;
                }
            }
           if(flag)
               break;
        }
    }
    //選擇排序
    public static void selectionSort(int[]a){
       for(int i=0;i<a.length-1;i++){
           int k=i;//記錄當前最小值位置
           for(int j=i+1;j<a.length;j++){
               if(a[k]>a[j])
                   k=j;
           }
           //內循環結束，也就是找到本轮循环的最小的数以后,再進行交換
           if(k!=i)
               swapReferences(a,k,i);
       }
    }
    private static void swapReferences(int[]a,int index0,int index1){
        int tmp = a[index0];
        a[index0] = a[index1];
        a[index1] = tmp;
    }
    // 1、需要遞增序列，則建立大頂堆2、堆排序中數組從0開始，而二叉堆中數組從1開始(0是哨兵)
    //堆排序開始：改進的選擇排序
    private static int leftChild(int i){
        return 2*i+1;
    }
    public static void perDown(int[]a,int hole,int n){
        int child;
        int tmp = a[hole];//待插入元素
        for(;leftChild(hole)<n;hole=child){
            child = leftChild(hole);
            if(child!=n-1&&a[child]<a[child+1])//最大數
                child++;
            if(tmp<a[child])//如果比孩子小
                a[hole] = a[child];
            else//這個不能少(不然tmp會被覆蓋)
                break;
        }
        a[hole] = tmp;//循環結束，找到插入位置
    }
    public static void heapSort(int[] a){
        for(int i=a.length/2-1;i>=0;i--)
            perDown(a,i,a.length);
        for(int i=a.length-1;i>0;i--){
            swapReferences(a,i,0);
            perDown(a,0,i);
        }
    }
    //堆排序結束

    //希爾排序：改進的插入排序
    public static  void shellSort(int[] a){
        int j;
        for(int gap=a.length/2;gap>0;gap=gap/2) {
            for (int i = gap; i < a.length; i+=gap) {//把1都改爲gap就行了
                int tmp = a[i];
                for (j = i; j >=gap && tmp < a[j - gap]; j-=gap)
                    a[j] = a[j - gap];
                a[j] = tmp;
            }
        }
    }
    //快速排序開始
    //得到樞紐元：三數取中法
    private static void dealPivot(int[]a,int left,int right){
        int center = (left+right)/2;
        if(a[left]>a[right])
            swapReferences(a,left,right);
        if(a[left]>a[center])
            swapReferences(a,left,center);
        if(a[center]>a[right])
            swapReferences(a,center,right);
        //把樞紐值放到倒數第二個位置
        swapReferences(a,center,right-1);
    }
    public static void quickSort(int[]a,int left,int right){
        if(left<right){
            //1、获取枢纽值，并将其放在当前待处理序列末尾
            dealPivot(a,left,right);
            //2、定義樞紐值位置、左指針i、右指針j
            int i = left;
            int j = right-1;
            int pivot = right-1;
            //3、移動指針：左指針前的元素小於樞紐值；右指針後的元素大於樞紐值
            while(true){
                while(a[++i]<a[pivot]){};
                while(j>0&&a[--j]>a[pivot]){};
                if(i<j)
                    swapReferences(a,i,j);
                else
                    break;
            }
            //4、restore pivot：將i和樞紐值交換
            if(i<right)
                swapReferences(a,i,pivot);
            //5、左右部分遞歸
            quickSort(a,left,i-1);
            quickSort(a,i+1,right);
        }
    }
    //快速排序結束

    //歸併排序開始
    private static void merge(int[] a,int left,int mid,int right,int[] tmp){
        //1、定義左、右、臨時數組指針
        int i=left;
        int j=mid+1;
        int t=0;
        //2、比較兩個指針指向的值
        while(i<=mid&&j<=right){
            if(a[i]<=a[j])
                tmp[t++]=a[i++];
            else
                tmp[t++]=a[j++];
        }
        //3、將左或右邊剩餘元素填充到tmp中
        while(i<=mid)
            tmp[t++]=a[i++];
        while(j<=right)
            tmp[t++]=a[j++];
        //4、臨時數組指針初始化
        t=0;
        //5、將tmp中的元素全部拷貝到原數組中
        while(left<=right)
            a[left++]=tmp[t++];
    }
    public static void mergeSort(int[] a,int left,int right,int[] tmp){
        if(left<right){
            int mid = (left+right)/2;
            mergeSort(a,left,mid,tmp);
            mergeSort(a,mid+1,right,tmp);
            merge(a,left,mid,right,tmp);
        }
    }
    //歸併排序結束

    public static void main(String[] args) {
        int[] a = new int[]{0,8,1,4,9,6,3,5,2,7};

        //冒泡
        //MySorts.bubble(a);
        MySorts.bubble1(a);

        //選擇
        //MySorts.selectionSort(a);

        //插入1
        //MySorts.insertSort(a);

        //插入2
        //MySorts.insertionSort(a);

        //堆排序
        //MySorts.heapSort(a);

        //希爾排序
        //MySorts.shellSort(a);

        //快速排序
        //MySorts.quickSort(a,0,a.length-1);

        //歸併排序
        //初始化臨時數組
        //int[] tmp = new int[a.length];
       //MySorts.mergeSort(a,0,a.length-1,tmp);


        System.out.println("排序結果："+ Arrays.toString(a));

    }
}
