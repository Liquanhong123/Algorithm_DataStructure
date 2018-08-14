package com.designPattern1.Facade;

/**
 * @Description:外观模式的一般描述是：外观模式定义了一个高层的功能，为子系统中的多个模块协同的完成某种功能需求提供简单的对外功能调用方式，使得这一子系统更加容易被外部使用。
 * @Author:Lixiaohong_666
 * @Date:Created in 21:14 2018/1/31
 */
public class FacadeTest {
    public static void main(String[] args) {
        System.out.println("開始辦理行政手續...");

        ApproveFacade approveFacade = new ApproveFacade();
        approveFacade.wholeApprove();

        System.out.println("行政手續辦理完...");
    }
}
