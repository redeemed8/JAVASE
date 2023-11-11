package SeniorArray.Map.TreeMap;

import java.util.TreeMap;

public class Introduce2 {
    public static void main(String[] args) {
        //  创建集合
        TreeMap<Student, String> tm = new TreeMap<>();

        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 12);
        Student s3 = new Student("wangwu", 30);

        tm.put(s1, "天津");
        tm.put(s2, "北京");
        tm.put(s3, "上海");

        System.out.println(tm);


    }
}
