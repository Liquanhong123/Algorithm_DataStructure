package com.designPattern1.Templatemethod;

/**
 * @Description:
 * @Author:Lixiaohong_666
 * @Date:Created in 17:58 2018/2/2
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        String exp = "5+8";
        AbstractCalculator cal = new Plus();
        int result = cal.getResult(exp, "\\+");
        System.out.println(result);
    }
}
