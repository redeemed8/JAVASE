package Daily_Things;

import java.util.Random;
import java.util.Scanner;

public class 置乱加密 {
    public static void main(String[] args) {
        String information;
        int length;


        //输入明文
        System.out.println("请输入明文");
        Scanner sc=new Scanner(System.in);
        information=sc.next();

        //统计长度
        length=information.length();

        //调用生成置换表
        int[] table;
        table=table(length);
//        //将输入的字符串转换为字符数组
//        char[] ch=new char[length];
//        ch=information.toCharArray();
//        //将明文进行打乱
//        char[] infor=new char[length];
//        for (int i = 0; i < length; i++) {
//            //将替换表zuoweixiabiao
//            infor[i]=ch[table[i]];
//
//        }
//        information=infor.toString();
//        //输出密文
//        System.out.println(information);
    }


    //生成置乱表
    public static int[] table(int length) {
        int[] table= new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int num;
            do {
                num = random.nextInt(length);
            } while (check(table, num,length));
            table[i] = num;
        }
        return table;
//        return new int[]{1};
    }



    //查重函数
    public static boolean check(int[] arr,int num,int length) {
        for (int i=0;i<length;i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

}
