package com.designPattern.command;

/**
 * @Description：调用者（司令员）
 * @Author： thtrt
 * @Createdate： 1/18/2018 11:05 AM
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    public void action(){
        command.exe();
    }
}
