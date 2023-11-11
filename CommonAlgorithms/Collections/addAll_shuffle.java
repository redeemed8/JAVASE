package CommonAlgorithms.Collections;

import java.util.*;

public class addAll_shuffle {
    public static void main(String[] args) {
        //  addAll  批量添加        只能添加单列集合

        //  1.创建集合对象
        ArrayList<String> list = new ArrayList<>();

        //  2.批量添加元素
        Collections.addAll(list,"a","b","c","d","e");

        //  3.打印集合
        System.out.println(list);

        //  shuffle 打乱
        Collections.shuffle(list);
        System.out.println(list);



    }
}
