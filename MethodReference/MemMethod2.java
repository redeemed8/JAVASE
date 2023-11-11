package MethodReference;

import java.util.ArrayList;
import java.util.Collections;

public class MemMethod2 {
    public static void main(String[] args) {
        //  引用本类成员方法
        //  引用处如果不是静态方法，可以通过 this 实现
        //  引用处如果是静态方法，可以通过  new 类名::方法名  来实现
        //  如果想要引用父类的成员方法，要用super

        //  创建集合
        ArrayList<String> list = new ArrayList<>();

        //  添加数据
        Collections.addAll(list, "张三", "李四", "王五", "赵六", "头七","张八");

        //  引用处是静态的  ↓
        list.stream().filter(new MemMethod2()::StringJudge).forEach(s -> System.out.print(s + " "));
        System.out.println("--------------------------");

        new MemMethod2().method(list);

    }

    public void method(ArrayList<String> list){
        //  引用处不是静态的  ↓
        list.stream().filter(this::StringJudge).forEach(s -> System.out.print(s + " "));
        System.out.println("--------------------------");
    }

    public boolean StringJudge(String s){
        return s.startsWith("张");
    }
}
