package CommonAlgorithms.Collections;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 3, 5, 6, 7, 2, 4, 9, 8);

        //  二分查找返回索引            没找到返回负数
        int i = Collections.binarySearch(list,3);
        System.out.println(i);

    }
}
