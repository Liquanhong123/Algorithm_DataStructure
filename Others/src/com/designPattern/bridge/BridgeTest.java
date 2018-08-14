package com.designPattern.bridge;

/**
 * @Description：通过对Bridge类的调用，实现了对接口Sourceable的实现类SourceSub1和SourceSub2的调用
 * @Author： thtrt
 * @Createdate： 1/15/2018 11:21 AM
 */
public class BridgeTest {
    public static void main(String[] args) {
        Bridge bridge = new MyBridge();
        //調用第一個對象
        Sourceable sourceable1 =  new SourceSub1();
        bridge.setSourceable(sourceable1);
        bridge.method();

        //調用第二個對象
        Sourceable sourceable2 = new SourceSub2();
        bridge.setSourceable(sourceable2);
        bridge.method();
    }
}
