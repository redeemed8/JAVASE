package SeniorArray;

import java.util.*;

/*      不可变集合        */         //不能被修改的集合，长度不可改，内容不能改，只能进行查询操作
public class FixedCollections {
    public static void main(String[] args) {

        //  细节：运用Set.of时，不能存在相同元素，不然会报错

        List<String> list = List.of("张三", "李四", "王五");          //  定义格式
        System.out.println(list);

        Set<String> set = Set.of("张三", "李四", "王五", "赵六");
        System.out.println(set);

        //  细节：运用Map.of时，参数个数有限，最多20个参数，10对！！

        Map<String, String> map = Map.of("张三", "3", "李四", "4",
                "王五", "5");
        System.out.println(map);

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

    }
}
