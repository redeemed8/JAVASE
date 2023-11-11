package SeniorArray.Map.TreeMap;

import java.util.*;

public class Introduce {
    public static void main(String[] args) {
        //  由键决定特性：不重复，无索引，可排序
        //  可按键值进行排序
        //  默认 从小到大

        //  和以前一样，要么实现 Comparable 接口
        //  要么传递 Comparator 比较器对象

        /* 键代表货品 id，值代表商品名称  */
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(5, "5号货物");
        tm.put(4, "4号货物");
        tm.put(1, "1号货物");
        tm.put(2, "2号货物");
        tm.put(3, "3号货物");
        //  打印集合
        System.out.println(tm);                     //  默认按照键的大小升序排列

        //  如果想要自己对Integer这些包装类定制排序规则，就要用以前的第二种排序规则

        TreeMap<Integer, String> tm2 = new TreeMap<>((o1, o2) -> {
            return o2 - o1;         //  规定降序排列
        });
        tm2.put(5, "5号货物");
        tm2.put(4, "4号货物");
        tm2.put(1, "1号货物");
        tm2.put(2, "2号货物");
        tm2.put(3, "3号货物");
        System.out.println(tm2);


    }
}
