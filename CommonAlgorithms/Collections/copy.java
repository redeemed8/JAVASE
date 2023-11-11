package CommonAlgorithms.Collections;

import java.util.*;

public class copy {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1, 3, 5, 6, 7, 2, 4, 9, 8);
        System.out.println(list1 + "\n---------------------------------");

        List<Integer> list2 = new ArrayList<>();
        //  为 list2 开辟空间大小，至少等于 list1
        list2 = Arrays.asList(new Integer[list1.size()]);           //  这个 asList 的方法返回一个List的对象

        Collections.copy(list2, list1);
        System.out.println(list2 + "\n---------------------------------");


    }
}
