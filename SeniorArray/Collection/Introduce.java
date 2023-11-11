package SeniorArray.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Introduce {
    //  List 和 Set 的父亲接口
    public static void main(String[] args) {
        /*
        add
        clear
        remove
        contains        查看是否包含某元素
        isEmpty
        size
         */

        //  Collection 是一个接口， 我们不能直接创建他的对象
        //  所以，我们学习时只能创建它的实现类对象
        //  实现类： ArrayList

        Collection<String> coll = new ArrayList<>();        //允许重复
        //  添加 add
        coll.add("aaa");
        coll.add("www");
        coll.add("eee");
        coll.add("ttt");
        System.out.println("add---" + coll);

        //  清空
/*        coll.clear();
        System.out.println(coll);*/

        //  删除
        //  collection里是set和List的共性，所以只能通过元素对象删除
        //  成功返回 true  失败返回 false
        System.out.println(coll.remove("aaa"));
        System.out.println(coll);

        //  判断元素是否包含
        boolean result = coll.contains("www");
        System.out.println(result);
        //  细节：底层是运用的 equals 方法来比较
        //  所以如果参数是自定义数据类型，则要在类中重写 equals 方法

        //  判空
        boolean ret1 = coll.isEmpty();
        System.out.println(ret1);

        //大小
        int size = coll.size();
        System.out.println(size);
    }
}
