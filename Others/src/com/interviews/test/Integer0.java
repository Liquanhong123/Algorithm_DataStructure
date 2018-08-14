package com.interviews.test;

/**
 * @Description:自動裝箱的陷阱
 * @Author:Lixiaohong_666
 * @Date:Created in 9:40 AM 2/25/2018
 */
public class Integer0 {
    static public  void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c == d);//true
        System.out.println(e == f);//false:整形池IntegerCache通过valueOf产生包装对象时，如果int参数在-128到127之间，则直接从整型池中获得对象，不在该范围的int类型则通过new生成包装对象。
        System.out.println(c == (a+b));//true
        System.out.println(c.equals(a+b));//true
        System.out.println(g == (a+b));//true
        System.out.println(g.equals(a+b));//false

        System.out.println("*************String*****************");
        String s1 = "a";
        String s2 = s1 + "b";
        String s3 = "a" + "b";
        System.out.println(s2 == "ab");
        System.out.println(s3 == "ab");
    }
}
