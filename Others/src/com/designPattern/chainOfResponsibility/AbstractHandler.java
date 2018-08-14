package com.designPattern.chainOfResponsibility;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/18/2018 10:43 AM
 */
public abstract class AbstractHandler {
    private  Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
