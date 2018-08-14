package com.designPattern.simpleFactory;

//這是普通工廠模式：
// 工厂模式(還有多工廠、靜態工廠)适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建


//共同接口
public interface Sender {
    public void Send();
}
