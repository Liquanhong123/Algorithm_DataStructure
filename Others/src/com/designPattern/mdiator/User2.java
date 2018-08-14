package com.designPattern.mdiator;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/20/2018 9:55 AM
 */
public class User2 extends User {
    public User2(Mediator mediator){
        super(mediator);
    }
    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
