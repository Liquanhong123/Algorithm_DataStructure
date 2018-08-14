package com.interviews.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Description:練習Map的幾種遍歷方法
 * @Author:Lixiaohong_666
 * @Date:Created in 3:01 PM 3/29/2018
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        //map.put("a",2);//故意覆蓋
        //方法一：通過keySet()
        Set<String> keys = map.keySet();
        for(String s: keys)
            System.out.print("key："+s+" "+"value："+map.get(s));
        System.out.println(" ");
        System.out.println("iterator遍歷...");
        Iterator<String> i = keys.iterator();
        while (i.hasNext()){
            String key=i.next();
            Integer value = map.get(key);
            System.out.print("key："+key+" "+"value："+value+" ");
        }
        System.out.println(" ");
        System.out.println("法二...");
        //方法二：通過Map.Entry、map.entrySet
        // map.entrySet(返回鍵值對(映射)Set),此例中返回 Set<Map.Entry<String,Integer>> es = map.entrySet();
        for(Map.Entry<String,Integer> m: map.entrySet())//m是一個鍵值對(映射)
            System.out.print("key："+m.getKey()+" "+"value："+m.getValue()+" ");
    }
}
