package com.designPattern.state;

/**
 * @Description：状态模式的切换类
 * @Author： thtrt
 * @Createdate： 1/18/2018 3:45 PM
 */
public class Context {
    private State state;

    //構造

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method(){
        if(state.getValue().equals("state1"))
            state.method1();
        else if(state.getValue().equals("state2"))
            state.method2();
    }
}
