package MethodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConstructorReference {
    public static void main(String[] args) {
        //  引用构造方法，，，是为了创建对象

        //  创建集合
        ArrayList<String> list = new ArrayList<>();

        //  添加数据
        Collections.addAll(list, "张三", "李四", "王五", "赵六", "头七","张八");

        //  封装成Student并且收集到list中
        List<Student> newList = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                Student su = new Student(s,18);
                return su;
            }
        }).toList();

        //  运用方法引用改写
        List<Student> newList2 = list.stream().map(Student::new).toList();

        System.out.println(newList);
        System.out.println(newList2);

    }
}
