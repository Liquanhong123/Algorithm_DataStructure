package com.timer.test1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/15/2018 10:44 AM
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("當前時間爲："+new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND,30);
        Date runDate = calendar.getTime();

        MyTask myTask = new MyTask();
        //一直運行
        //Timer timer = new Timer();
        //改爲守護線程：線程創建成功就退出
        Timer timer = new Timer(true);
        timer.schedule(myTask,runDate);
    }
}
