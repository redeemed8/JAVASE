package MethodReference;

import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {
        //  需求：创建一个数组，进行倒序排列
        Integer[] arr = {3, 2, 4, 5, 67, 7, 6, 5};

        //  匿名内部类
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        //  lambda表达式
        Arrays.sort(arr, (o1, o2) -> o2 - o1);

        //  方法引用
        //  引用的方法可以是Java给你写好的，也可以是第三方提供的
        Arrays.sort(arr, Demo1::subtraction);

        System.out.println(Arrays.toString(arr));
    }

    public static int subtraction(int o1, int o2) {
        return o2 - o1;
    }

}
