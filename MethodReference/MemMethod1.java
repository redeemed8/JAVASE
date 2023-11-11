package MethodReference;

import java.util.ArrayList;
import java.util.Collections;

public class MemMethod1 {
    public static void main(String[] args) {
        //  引用其他类成员方法
        //  其他类对象::方法名

        //  创建集合
        ArrayList<String> list = new ArrayList<>();

        //  添加数据
        Collections.addAll(list, "张三", "李四", "王五", "赵六", "头七","张八");

        //  过滤数据（想要姓张的）
        list.stream().filter(new StringJudge()::stringjudge).forEach(s -> System.out.print(s + " "));

        //
        //  在静态方法中是没有 this 的！！！
        //

    }
}
