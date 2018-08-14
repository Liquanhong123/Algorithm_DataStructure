package com.designPattern.builder;

import com.designPattern.abstractFactory.MailSender;
import com.designPattern.abstractFactory.Sender;
import com.designPattern.abstractFactory.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description：建造者模式
 * @Author： thtrt
 * @Createdate： 1/13/2018 9:58 AM
 */
public class Builder {
    //引用abstractFactory.Sender
    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count){
        for(int i=0;i<count;i++){
            list.add(new MailSender());
        }
    }
    public void produceSmsSender(int count){
        for(int i=0;i<count;i++){
            list.add(new SmsSender());
        }
    }
}
