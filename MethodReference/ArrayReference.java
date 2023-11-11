package MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayReference {
    public static void main(String[] args) {
        //  数组名引用
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7);

        //  收集到数组中
        Integer[] arr2 = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr2));

    }
}
