package com.designPattern.mdiator;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/20/2018 9:54 AM
 */
public abstract class User {
    private Mediator mediator;
    //構造
    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void work();
}
