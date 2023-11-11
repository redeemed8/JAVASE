package CommonAlgorithms.Collections;

import java.util.*;

public class swap {
    public static void main(String[] args) {
        //  交换集合中指定位置的元素
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1, 3, 5, 6, 7, 2, 4, 9, 8);
        Collections.swap(list1, 0, 8);
        System.out.println(list1);
    }
}
