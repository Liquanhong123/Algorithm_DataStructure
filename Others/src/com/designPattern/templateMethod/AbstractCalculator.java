package com.designPattern.templateMethod;

/**
 * @Description：
 * 一个抽象类中，有一个主方法，再定义1...n个方法，可以是抽象的，也可以是实际的方法，定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用
 * 在AbstractCalculator类中定义一个主方法calculate，calculate()调用spilt()等，Plus和Minus分别继承AbstractCalculator类，通过对AbstractCalculator的调用实现对子类的调用
 * @Author： thtrt
 * @Createdate： 1/16/2018 9:52 PM
 */
public abstract  class AbstractCalculator {
    //主方法，實現對本類其他方法的調用
    public final int calculate(String exp,String opt){
        int array[] = split(exp,opt);
        return calculate(array[0],array[1]);
    }

    abstract public int calculate(int i, int i1);

    private int[] split(String exp, String opt) {
        String array[] = exp.split(opt);
        int arrayInt[]=new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
