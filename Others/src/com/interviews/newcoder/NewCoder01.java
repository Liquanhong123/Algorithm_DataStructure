package com.interviews.newcoder;

import java.util.Calendar;

/**
 * @Description:实现字符串的反转及替换
 * @Author:Lixiaohong_666
 * @Date:Created in 1:50 PM 2/6/2018
 */
public class NewCoder01 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        //NewCoder01 newCoder01 = new NewCoder01();
        NewCoder01 newCoder01 = NewCoder01.class.newInstance();

        String s1 = "happy";
        String s2 = newCoder01.reverse(s1);
        System.out.println(s2);

    }
    public  String reverse(String originStr){
        if(originStr==null || originStr.length()<=1)
            return originStr;
//        String tmp=originStr.substring(1)+originStr.charAt(0);
        return reverse(originStr.substring(1))+originStr.charAt(0);
    }
}
