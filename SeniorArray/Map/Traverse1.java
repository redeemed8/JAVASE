package SeniorArray.Map;

import java.util.*;

public class Traverse1 {
    public static void main(String[] args) {
        //  遍历操作
        Map<String, String> map1 = new HashMap<>();
        map1.put("小111","大111");
        map1.put("小333","大333");
        map1.put("小222","大222");
        map1.put("小444","大444");

        //  1. 通过键找值
        //  先把键都找出来，放在单列集合里，然后找值
        Set<String> keys = map1.keySet();
        for (String key : keys) {
            String s = map1.get(key);
            System.out.print(key + "=" + s + " ");
        }
        System.out.println("\n------------");

        //  2. 迭代器
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.print(s + " ");
        }
        System.out.println("\n------------");

        //  3. lambda表达式
        keys.forEach( s -> System.out.print(map1.get(s) + " "));


    }
}
