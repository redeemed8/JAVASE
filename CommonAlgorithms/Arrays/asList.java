package CommonAlgorithms.Arrays;

import java.util.*;

public class asList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[5]);
        //  用这种方法生成的集合，大小不可改变
        System.out.println(list);
        Collections.fill(list, "1");
        System.out.println(list);
        //list.add("2");
        //list.remove(1);
        //System.out.println(list);

        String s = list.set(0, "99");            //  修改元素
        System.out.println(s);
        System.out.println(list);

    }
}
