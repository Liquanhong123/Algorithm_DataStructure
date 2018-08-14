package com.designPattern.strategy;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/16/2018 6:55 PM
 */
public class StrategyTest {
    public static void main(String[] args) {
        String exp = "2*8";
        ICalculator calculator = new Multip();
        int result = calculator.calculate(exp);
        System.out.println(result);
    }
}
