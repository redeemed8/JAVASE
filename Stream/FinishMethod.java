package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class FinishMethod {
    public static void main(String[] args) {
        //  终结方法
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张老三", "张三丰", "张无忌", "王伟两", "王好", "哈哈哈", "张三丰", "张三丰", "张三丰");

        //  遍历  forEach。。。
        list.stream().forEach(o -> System.out.println(o));

        long count = list.stream().count();
        System.out.println(count);

        //  toArray()           收集流中的数据，放到数组中
        Object[] arr1 = list.stream().toArray();
        System.out.println(Arrays.toString(arr1));

        //  放到指定类型数组中
        String[] arr2 = list.stream().toArray(new IntFunction<String[]>() {
            //  形参是六种数据的个数，要和数组长度保持一致
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr2));
        //  作用：创建一个指定类型的数组
        //  底层：依次得到流中的数据，并放到数组中

        //  lambda 表达式
        String[] arr3 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr3));


    }
}
