package com.designPattern.builder;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/13/2018 10:01 AM
 */
public class Test {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
    }
}
