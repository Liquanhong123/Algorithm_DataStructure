package com.designPattern.memento;

/**
 * @Description：
 * @Author： thtrt
 * @Createdate： 1/18/2018 11:16 AM
 */
public class Original {
    private String value;
    //構造
    public Original(String value){
        this.value = value;
    }
    //創建備忘錄
    public Memento createMemento(){
        return new Memento(value);
    }
    //恢復備忘錄
    public void restoreMemento(Memento memento){
        this.value = memento.getValue();
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
