package SeniorArray.Generic;

import java.text.DecimalFormat;

public class GenericFunc {
    public static void main(String[] args) {
        String s = "woShiDaShaBi";
        Integer i = 100;
        Double b = 12.3987;
        Character c = 'p';
        print1(i);
        print1(s);
        print1(b);
        print1(c);

        printNum(2,3,4,5,6,7,8,3,12);


    }

    public static <T> void print1(T data){
        System.out.println(data);
    }

    public static <T> void printNum(T...t){
        //  任意个数的参数
        for(T data : t)
            System.out.print(data + " ");
    }
}
