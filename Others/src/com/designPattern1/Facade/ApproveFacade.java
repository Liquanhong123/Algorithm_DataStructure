package com.designPattern1.Facade;

/**
 * @Description:外觀類
 * @Author:Lixiaohong_666
 * @Date:Created in 21:16 2018/1/31
 */
public class ApproveFacade {
    public ApproveFacade(){

    }
    void  wholeApprove(){
        new HealthOffice().approve();
        new RevenueOffice().approve();
        new SaicOffice().approve();
    }
}
