package Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Introduce2 {
    public static void main(String[] args) {
        //  数组

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};               //  基本数据类型
        Arrays.stream(arr1).forEach(o -> System.out.print(o + " "));
        System.out.println("\n---------------------");

        String[] arr2 = {"aa", "bb", "cc", "dd"};              //  引用数据类型
        Arrays.stream(arr2).forEach(o -> System.out.print(o + " "));
        System.out.println("\n---------------------");

        //  一堆零散的数据

        Stream.of(1, 2, 3, 4, 5).forEach(o -> System.out.print(o + " "));
        System.out.println("\n---------------------");

        Stream.of("a", "b", "c", "d").forEach(o -> System.out.print(o + " "));

        //  但是如果用这个方法，传递基本类型数据的数组，他会把数组当作一个元素，打印其地址值

    }
}
