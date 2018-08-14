package com.designPattern1.Flyweight;

/**
 * @Description:当系统中可能具有多个相同的对象时，对于具有相同的内容的对象可以实现对象的共享，即共享池，以此避免不必要的相同对象的创建以减少系统内存的开销。称之为享元模式
内蕴状态：享元对象内部的可以以此来作为区分是否是同一个对象的依据的属性。内蕴状态不随着外部环境的变化而变化。
外蕴狀態：虽然也是享元对象的属性，但可以随着外部环境的变换而变化，同一享元对象在不同的地方其内部的外蕴状态可能不同。
 * @Author:Lixiaohong_666
 * @Date:Created in 17:20 2018/2/2
 */
public interface Flyweight {
    //用於改變外蓄狀態
    public void changeStat(String exState);
}
