package CommonAlgorithms.Collections;

import java.util.*;

public class sort {
    public static void main(String[] args) {
        //  默认排序        默认升序
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 3, 5, 6, 7, 2, 4, 9, 8);
        System.out.println(list+"\n----------------------------");
        Collections.sort(list);
        System.out.println(list+"\n----------------------------");
/*
       Collections.sort(list,(o1,o2)->{
            return o2 - o1;
        });
*/
        list.sort((o1, o2) -> {
            return o2 - o1;
        });
        System.out.println(list);

    }

}
