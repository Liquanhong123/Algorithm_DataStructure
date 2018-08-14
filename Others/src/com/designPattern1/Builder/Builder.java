package com.designPattern1.Builder;

/**
 * @Description:工人接口，定义了工人所要进行的工作。他们负责进行具体部件如窗户，地板的建造。同时因为房子是民工建的，因此建设完成后由他把房子递交回房主
 * @Author:Lixiaohong_666
 * @Date:Created in 3:34 PM 1/30/2018
 */
public interface Builder {
     void makeWindow();
     void makeFloor();
     Room getRoom();
}
