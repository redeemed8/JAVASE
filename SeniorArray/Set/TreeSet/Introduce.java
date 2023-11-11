package SeniorArray.Set.TreeSet;

import java.util.TreeSet;

public class Introduce {
    public static void main(String[] args) {
        /*  底层是红黑树  */

        //正常情况下,是按照从小到大顺序自动排序
        TreeSet<String> ts1 = new TreeSet<>();
        ts1.add("bbb");
        ts1.add("ccc");
        ts1.add("aaa");
        for (String t : ts1) {
            System.out.print(t + " ");
        }
        System.out.println();
        System.out.println("-------------------------");

        //对于自定义类型的数据，第一种排序方法就是在类中实现Comparable接口，自己重写   compareTo  方法
        TreeSet<Student> ts2 = new TreeSet<>();
        Student st1 = new Student("zhangSan",18);
        Student st2 = new Student("liSi",30);
        Student st3 = new Student("wangWu",22);
        ts2.add(st1);
        ts2.add(st2);
        ts2.add(st3);
        System.out.println(ts2);

        //如果想要按照自己的方法排序
        //可以自己写一个匿名方法
        /*   第二种排序方式   */
        TreeSet<String> ts3 = new TreeSet<>((o1,o2)->{
            int i = o1.length() - o2.length();
            i = i == 0 ? o1.compareTo(o2) : i;
            return i;
        });
        ts3.add("aaaa");
        ts3.add("aa");
        ts3.add("a");
        ts3.add("bb");
        System.out.println(ts3);

    }
}
