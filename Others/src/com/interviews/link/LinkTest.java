package com.interviews.link;

/**
 * @Description：鏈表測試
 * @Author： thtrt
 * @Createdate： 1/19/2018 11:31 AM
 */
public class LinkTest {
    public static void main(String[] args) {
        Link link = new LinkImpl();
        link.add("A");
        link.add("B");
        link.add("C");
        link.add(new String[]{"D","E"});
        //取得所有
        Object[] objects = link.getAll();
        for(Object obj: objects)
            System.out.println(obj);

        System.out.println(objects.length);
        System.out.println(link.exists(null));
        System.out.println(link.get(3));
        link.delete("C");

        objects = link.getAll();
        for(Object obj: objects)
            //這是原來開閉的空間,大小還是5
            System.out.println(obj);
    }
}
