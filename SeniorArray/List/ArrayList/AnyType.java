package SeniorArray.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class AnyType {
    public static void main(String[] args) {

        //  不加泛型的集合，可以添加任意的数据类型的元素
        //  但是不能使用元素的特有功能
        //  如果要使用，要强制转换类型
        //  说白了，是一个用来存储观察的集合
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(1.92);
        list.add("haHaha");
        list.add('w');

        //  遍历
        for (Object o : list) {
            System.out.println(o);
        }

    }
}
