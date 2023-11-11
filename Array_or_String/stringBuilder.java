package Array_or_String;

import java.lang.String;
import java.lang.StringBuilder;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");               //create
        //add
        sb.append(true);
        sb.append(12);
        //test
        System.out.println(sb);
        //reverse
        sb.reverse();
        //length
        int len = sb.length();
        System.out.println(len);
        //toString
        String str = sb.toString();
        System.out.println(str);


        //test
        System.out.println(sb);
    }
}
