package SeniorArray.Set.HashSet;

import java.util.HashSet;

public class Introduce {
    public static void main(String[] args) {
 /*     底层原理是哈希表，综合了数组，链表，和红黑树的原理
        运用哈希值和类内部数组长度进行计算，以此确定插入数组的位置
        在插入时会判空，空直接插入，非空直接挂下面

        无序，无索引，自动去重
        */
        HashSet<String> hs = new HashSet<>();
        hs.add("aaaa");
        hs.add("bbbb");
        hs.add("cccc");
        hs.add("dddd");

        System.out.println();

        for (String h : hs) {
            System.out.println(h);
        }

    }
}
