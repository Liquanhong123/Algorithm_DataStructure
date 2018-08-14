package com.designPattern.interpreter;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/20/2018 10:04 AM
 */
public class Plus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1()+context.getNum2();
    }
}
