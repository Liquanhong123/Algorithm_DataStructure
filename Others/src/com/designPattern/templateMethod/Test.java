package com.designPattern.templateMethod;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/16/2018 9:59 PM
 */
public class Test {
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator calculator = new Plus();
        int result = calculator.calculate(exp,"\\+");
        System.out.println(result);
    }
}
