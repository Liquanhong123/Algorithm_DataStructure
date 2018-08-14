package com.designPattern1.Templatemethod;

/**
 * @Description:
 * @Author:Lixiaohong_666
 * @Date:Created in 17:57 2018/2/2
 */
public class Plus extends AbstractCalculator {
    @Override
    public int calculate(int num1, int num2) {
        return num1+num2;
    }
}
