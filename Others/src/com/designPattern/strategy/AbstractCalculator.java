package com.designPattern.strategy;

/**
 * @Description：這是輔助類
 * @Author： thtrt
 * @Createdate： 1/16/2018 6:49 PM
 */
public abstract class AbstractCalculator {
    //格式爲：2*5
    public int[] split(String exp,String opt){
        String[] array = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
