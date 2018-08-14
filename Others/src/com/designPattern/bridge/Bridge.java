package com.designPattern.bridge;

/**
 * @Description：定義一個橋，持有Sourceable的一個實例
 * @Author： thtrt
 * @Createdate： 1/15/2018 11:19 AM
 */
public abstract  class Bridge {
    private Sourceable sourceable;

    public void method(){
        sourceable.method();
    }

    public Sourceable getSourceable() {
        return sourceable;
    }

    public void setSourceable(Sourceable sourceable) {
        this.sourceable = sourceable;
    }

}
