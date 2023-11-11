package SeniorArray.List.ArrayList;

/*  ArrayList 的底层原理   */

import java.util.ArrayList;

public class Introduce {
    public static void main(String[] args) {
        /*  ArrayList 底层是数组结构  */
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(2);
        list1.add(2);
        System.out.println(list1);
        /* addAll  */
/*      ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list1);*/
        ArrayList<Integer> list2 = new ArrayList<>(list1);
        System.out.println(list2);

        //System.out.println(list2.get(1));

        //  先创建一个长度为 0 的数组
        //  添加第一个元素时，扩容为 10
        //  再次存满，会扩容 1.5 倍
        //  每次扩容会进行比较           max(当前容量/2, 理论应该增加的容量)

        //  设置容量大小， 如果设置的容量比现有容量小，并不会改变当前已存元素
        list1.ensureCapacity(10);
        System.out.println(list1);

    }
}
