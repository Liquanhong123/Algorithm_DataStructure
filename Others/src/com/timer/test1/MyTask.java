package com.timer.test1;

import java.util.Date;
import java.util.TimerTask;

/**
 * @Description：在未來執行的效果
 * @Author： thtrt
 * @Createdate： 1/15/2018 10:42 AM
 */
public class MyTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("任務執行了，時間爲："+new Date());
    }
}
