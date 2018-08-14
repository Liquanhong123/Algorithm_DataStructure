package com.designPattern.state;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/18/2018 3:47 PM
 */
public class StateTest {
    public static void main(String[] args) {
        State state = new State();
        Context context = new Context(state);
        //設置第一種狀態
        state.setValue("state1");
        context.method();
        //設置第二種狀態
        state.setValue("state2");
        context.method();
    }
}
