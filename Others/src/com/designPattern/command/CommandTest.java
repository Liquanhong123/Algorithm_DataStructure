package com.designPattern.command;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/18/2018 11:10 AM
 */
public class CommandTest {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new MyCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
