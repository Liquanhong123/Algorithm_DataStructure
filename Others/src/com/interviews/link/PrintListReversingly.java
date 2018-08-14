package com.interviews.link;

/**
 * @Description：從尾到頭打印單鏈表
 * @Author： thtrt
 * @Createdate： 1/19/2018 11:37 AM
 */
public class PrintListReversingly {
    public static void main(String[] args) {
        Link link = new  LinkImpl();
        link.add(new String[]{"A","B","C","D"});
        System.out.println("從尾到頭打印單鏈表");
        Object[] objects = link.getAll();
        for(int x=objects.length-1;x>=0;x--)
            System.out.println(objects[x]);
    }
}
