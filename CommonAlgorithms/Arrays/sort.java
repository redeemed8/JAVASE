package CommonAlgorithms.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class sort {
    public static void main(String[] args) {
        //Arrays.sort(数组, 排序规则)

        //第二个参数是一个接口，作为排序的规则，可以写成匿名类
        Integer[] arr = {1, 33, 4, 52, 5, 7, 8, 97, 4, 3, 2};

        //数组必须是引用类型的！！！！！！！！    int 必须 写成 Integer

/*        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });*/

        //简化式写法
        //lambda
        //  可以省略参数类型, 如果只有一个参数，那么 形参的括号 也省略
        //  如果lambda表达式只有一行     可以直接写成 (o1, o2) -> o1 - o2  就 ok
        Arrays.sort(arr,(o1, o2)->{
            return o1 - o2;
        });

        //  二次简化
        Arrays.sort(arr,(o1, o2) -> o1 - o2);

        for(int i : arr)
            System.out.println(i);

    }
}
