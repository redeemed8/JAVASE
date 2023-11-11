package MethodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StaticMethod {
    public static void main(String[] args) {
        //  引用静态方法
        //  格式：类名::静态方法

        //  需求：将集合中的数字字符串变成int类型

        //  创建集合
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5");

        //  方法引用
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach(System.out::println);

        System.out.println("-------------------");

        list.stream().map(Integer::parseInt).forEach(System.out::println);

    }
}
