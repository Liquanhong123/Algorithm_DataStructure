package com.designPattern.strategy;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/16/2018 6:52 PM
 */
public class Minus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\-");
        return arrayInt[0]-arrayInt[1];
    }
}
