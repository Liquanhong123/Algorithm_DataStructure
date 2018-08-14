package com.designPattern.interpreter;

/**
 * @Description：解释器模式:一般主要应用在OOP开发中的编译器的开发中，所以适用面比较窄。
 * Context类是一个上下文环境类，Plus和Minus分别是用来计算的实现，代码如下：
 * @Author： thtrt
 * @Createdate： 1/20/2018 10:02 AM
 */
public interface Expression {
    int interpret(Context context);
}
