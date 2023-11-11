package CommonAlgorithms.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class maxmin {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1, 3, 5, 6, 7, 2, 4, 9, 8);

        int max = Collections.max(list1);
        System.out.println(max);

        int min = Collections.min(list1);
        System.out.println(min);


    }
}
