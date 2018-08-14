package com.designPattern.Facade;

/**
 * @Description：只有三個零件的引用，使這三個關聯起來了
 * @Author： thtrt
 * @Createdate： 1/13/2018 10:28 PM
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;
    public Computer(){
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }
    public  void startup(){
        System.out.println("start Computer !");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start Computer finished!");
    }
    public void shutdown(){
        System.out.println("begin to close the computer");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer closed!");
    }
}
