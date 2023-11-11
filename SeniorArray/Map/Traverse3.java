package SeniorArray.Map;

import java.util.*;
import java.util.function.BiConsumer;

public class Traverse3 {
    public static void main(String[] args) {
        //  第三种遍历方式     foreach
        Map<String, String> map1 = new HashMap<>();
        map1.put("小111","大111");
        map1.put("小333","大333");
        map1.put("小222","大222");
        map1.put("小444","大444");

        map1.forEach((key,value)->{
            System.out.print(key + "=" + value + " ");
        });

/*        map1.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.print(key + "=" + value + " ");
            }
        });*/




    }
}
