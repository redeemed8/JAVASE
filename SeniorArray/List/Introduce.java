package SeniorArray.List;

import java.util.*;
/*
void add ( index, element)              插入
E remove( index )                       删除       返回被删除元素
E remove( data )                        删除第一个data   返回boolean
E set( index, element)                  修改       返回被修改的元素
E get( index )                                    返回该索引处的元素
*/
public class Introduce {
    public static void main(String[] args) {

/*         List系列
        特点：添加的元素式有序，可重复，有索引的
        注意：
        有序的意思不是会自动帮你排序
        是存的顺序等于取的顺序
        说白了就是不会打乱你存进去的顺序，也就是保持正常顺序
        数据可以重复          */

        List<Integer> list = new ArrayList<>();

        //  添加元素      尾插

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(9);
        list.add(933);

        list.add(9);
        list.add(9);
        list.add(9);

        list.add(1,9);      //指定索引
        System.out.println(list);

        //  删除
        //  有两种删除，一个是指定索引删除，一个是指定元素删除
        //  但是对于重载来说，他会优先调用形参和实参类型一致的那个方法
        /*
         *   所以你如果单纯的传入一个常量 1， 那么就是删除 1 索引处的元素
         *   如果想要删除元素 1 ，应该代入 Integer类 的 1
         */
        //  删除索引
        Integer ret1 = list.remove(1);
        System.out.println("删除了----" + ret1);
        System.out.println(list);

        //  删除元素
        Integer i1 = 9;
        list.remove(i1);
        System.out.println(list);

        //  修改，获取
        //  lueluelue


        Object[] a =  list.toArray();
/*        for(int i : a)
            System.out.println(i);*/
        for(Object i : a)
            System.out.print(i + " ");
    }
}
