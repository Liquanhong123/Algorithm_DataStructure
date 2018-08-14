package com.designPattern1.Templatemethod;

/**
 * @Description:模板方法模式需要开发抽象类和具体子类之间的协作。抽象类负责给出一个算法的轮廓和骨架，子类则负责给出这个算法的各个逻辑步骤
 * @Author:Lixiaohong_666
 * @Date:Created in 17:51 2018/2/2
 */
abstract class AbstractCalculator {
    // 主方法，实现对本类其它方法的调用
    public final int getResult(String exp,String opt){
        int array[] = split(exp, opt);
        return calculate(array[0],array[1]);
    }
    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
    //被子類重寫的方法
    abstract public int calculate(int num1,int num2);
}
