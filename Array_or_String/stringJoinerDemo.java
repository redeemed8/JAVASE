package Array_or_String;

import java.util.StringJoiner;

public class stringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ","[","]");              //add添加的元素必须是string
        sj.add(1+"").add(2+"");
        //test
        System.out.println(sj);
        //length
        System.out.println(sj.length());
        System.out.println(sj.toString());

    }
}
