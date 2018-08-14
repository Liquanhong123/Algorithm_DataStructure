package com.timer.test2;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @Description：schedule(TimerTask task,Date firstTime,long perid)在指定的日期之後按指定的間隔週期,無限循環地執行某個任務
 * @Author： thtrt
 * @Createdate： 1/15/2018 11:05 AM
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println("當前時間爲："+new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND,10);
        Date runDate = calendar.getTime();
        System.out.println("計劃時間爲："+runDate);

        MyTask task = new MyTask();
        Timer timer = new Timer();
        timer.schedule(task,runDate,4000);
    }
}
