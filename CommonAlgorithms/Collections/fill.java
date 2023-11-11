package CommonAlgorithms.Collections;

import java.util.*;

public class fill {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        int size = 10;
        //  填充之前先开辟空间
        list1 = Arrays.asList(new Integer[size]);

        Collections.fill(list1,1);
        System.out.println(list1);
    }
}
