package com.designPattern.interpreter;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/20/2018 10:08 AM
 */
public class Multiply implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1()*context.getNum2();
    }
}
