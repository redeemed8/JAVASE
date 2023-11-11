package Stream;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

public class MidMethod {
    public static void main(String[] args) {
        //  中间方法
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张老三", "张三丰", "张无忌", "王伟两", "王好", "哈哈哈", "张三丰", "张三丰", "张三丰");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "我是第二个");

        //  filter 过滤方法
        list.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);          //  过滤出开头为三的
        System.out.println("-----------------------");

        //  limit   获取前几个元素
        list.stream().limit(3).forEach(System.out::println);            //  只要前 3 个
        System.out.println("-----------------------");

        //  skip    跳过前几个元素
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("-----------------------");

        //  distinct    去重      依赖 hashCode 和 equals 方法     如果是自定义类型要重写方法
        list.stream().distinct().forEach(System.out::println);
        System.out.println("-----------------------");

        //  concat      合并 a 和 b 两个流为一个流        是一个静态方法
        Stream.concat(list.stream(), list2.stream()).forEach(System.out::println);
        System.out.println("-----------------------");

        //  map     转换流中的数据类型

        /*
        注意一： 中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
        注意二： 修改Stream流中的数据，不会影响原来集合或者数组中的数据
        */

        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "王-3", "李-4", "王-5", "赵-6");
        list3.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
                String ageString = arr[1];
                return Integer.parseInt(ageString);
            }
        }).forEach(System.out::println);
        System.out.println("------------------------");

        //  map  的  lambda  表达式
        list3.stream()
                .map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(System.out::println);



    }
}
