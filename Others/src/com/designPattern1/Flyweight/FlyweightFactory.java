package com.designPattern1.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:工廠類：用來管理享元對象
 * @Author:Lixiaohong_666
 * @Date:Created in 17:26 2018/2/2
 */
public class FlyweightFactory {
    private static Map<String, Flyweight> flyweightMap = new HashMap<String, Flyweight>();
    public static Flyweight getFlyweight(String innerState){
        Flyweight flyweight = flyweightMap.get(innerState);
        if(flyweight == null){
            flyweight = new ConcreteFlyweight(innerState);
            flyweightMap.put(innerState,flyweight);
        }
        return flyweight;
    }
}
