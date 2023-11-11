package Daily_Things;

import java.util.Scanner;


public class 进制转换 {
    public static void main(String[] args) {
        //输入明文
        System.out.println("请输入明文");
        Scanner sc = new Scanner(System.in);
        String information = sc.next();
        //输出密文
        String _2ciphertext = _2entrypt(information);
        String _16ciphertext = _16entrypt(information);
        System.out.println("转化为二进制为" + _2ciphertext);
        System.out.println("转化为十六进制为" + _16ciphertext);
    }


    //  二进制加密
    public static String _2entrypt(String information) {
        int length = information.length();
        char[] inforch = information.toCharArray();
        int[] inforin = new int[length];
        for (int i = 0; i < length; i++) {
            inforin[i] = inforch[i];
        }

        String[] a = new String[length];
        for (int i = 0; i < length; i++) {
            a[i] = Integer.toBinaryString(inforin[i]);
            int len = a[i].length();
            for (int j = 8; j > len; --j)
                a[i] = "0" + a[i];
        }
        StringBuffer b = new StringBuffer();
        for (String s : a)
            b.append(s).append(" ");
        String c = b.toString();
        return c;


    }


    //16进制加密
    public static String _16entrypt(String information) {
        int length = information.length();
        char[] inforch = information.toCharArray();
        int[] inforin = new int[length];
        for (int i = 0; i < length; i++)
            inforin[i] = inforch[i];
        String[] a = new String[length];
        for (int i = 0; i < length; i++)
            a[i] = Integer.toString(inforin[i], 16);
        StringBuffer b = new StringBuffer();
        for (String s : a) b.append(s).append(" ");
        String c = b.toString();
        return c;
    }
}