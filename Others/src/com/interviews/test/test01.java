package com.interviews.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author:Lixiaohong_666
 * @Date:Created in 9:40 AM 2/25/2018
 */
public class test01 {
    static public void main(String[] args)  {
        List list = new LinkedList();
        for (int i = 0; i <= 5; i++) {
            list.add("a" + i);
        }
        System.out.println(list);
        list.add(3, "a100");
        System.out.println(list);
        String b = (String) list.set(3, "a200");
        System.out.println(b);//返回的值
        System.out.println(list);
    }
}
