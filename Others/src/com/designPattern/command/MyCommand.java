package com.designPattern.command;

/**
 * @Description：命令實現類
 * @Author： thtrt
 * @Createdate： 1/18/2018 11:06 AM
 */
public class MyCommand implements Command {
    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
