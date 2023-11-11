package MethodReference;

import java.util.*;

public class MemMethod3 {
    public static void main(String[] args) {
        //  使用类名引用成员方法

        //  独有的规则
        //  1.函数式接口
        //  2.被引用的方法已经存在
        //  3.被引用方法的形参，需要跟抽象方法的第二个形参到最后一个形参保持一致，返回值也保持一致
        //  4.被引用的方法需要满足当前的需求

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "bbb", "ccc", "ddd");
        //  转换为大写
        List<String> newList = list.stream().map(String::toUpperCase).toList();
        System.out.println(newList);

        //  抽象方法形参的详解：
        //  第一个参数：表示被引用方法的调用者，决定了可以引用哪些类中的方法
        //            在 Stream 流当中，第一个参数一般都表示流里面的每一个数据
        //            假设流里面的数据是字符串，那么使用这种方法进行方法引用，只能引用 String 这个类中的方法
        //  第二个参数到最后一个参数：跟被引用方法的形参保持一致


    }
}
