package com.designPattern.templateMethod;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/16/2018 9:58 PM
 */
public class Plus extends AbstractCalculator {

    @Override
    public int calculate(int i, int i1) {
        return i+i1;
    }
}
