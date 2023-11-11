package Daily_Things;

import java.util.Scanner;

public class 位移加密 {
    public static void main(String[] args) {
        //输入明文
        System.out.println("请输入明文");
        Scanner sc = new Scanner(System.in);
        String information = sc.next();
        //输入密钥
        System.out.println("请输入密钥");

        int key = sc.nextInt();
        String ciphertext = entrypt(information, key);
        //输出密文
        System.out.println(ciphertext);
        //输入密文
        System.out.println("请输入密文");
        String ciphertext2 = sc.next();
        //输入密钥
        System.out.println("请输入密钥");
        int key2 = sc.nextInt();
        String information2 = decode(ciphertext2, key2);
        //输出明文
        System.out.println(information2);

    }

    //加密方法
    public static String entrypt(String information, int key) {
        //获取明文长度
        int length = information.length();
        //将字符串转化为字符数组
        char[] a = information.toCharArray();
        //进行位移加密
        for (int i = 0; i < length; i++) {
            if (97 < (int) (a[i] + key % 26)) {
                a[i] = (char) ((int) (a[i] + key % 26) - 123 + 96);
            } else {
                a[i] = (char) (a[i] + key % 26);
            }

        }
        //将字符数组转化为字符串
        String b = new String(a);
        return b;
    }
    //解密方法
    public static String decode(String ciphertext2, int key2) {
        //获取密文长度
        int length = ciphertext2.length();
        //将字符串转化为字符数组
        char[] a = ciphertext2.toCharArray();
        //进行位移解密
        for (int i = 0; i < length; i++) {
            if ((int) (a[i] - key2 % 26) < 97) {
                a[i] = (char) (124 - (97 - (int) (a[i] - key2 % 26)));
            } else {
                a[i] = (char) (a[i] - key2 % 26);
            }
        }
        //将字符数组转化为字符串
        String b = new String(a);
        return b;
    }
}
