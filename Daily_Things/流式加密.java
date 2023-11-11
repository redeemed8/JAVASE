package Daily_Things;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 流式加密 {
    public static void main(String[] args) throws Exception {
        //输入明文
        System.out.print("请输入明文:");
        Scanner sc = new Scanner(System.in);
        String information = sc.next();     //  明文是 information
        String key;
        key = makekey(information.length());
        System.out.println("生成密钥:" + key);
        //导出密钥
        //进行加密

        String ciphertext = encrypt(information, key);

        //输出密文
        System.out.println("生成密文:" + ciphertext);

        //导出密文
        txtout(ciphertext, key);
        //读取文件
        String[] st = txtInt();

        System.out.println("------------\n导出密文:" + st[0]);
        System.out.println("导出密钥:" + st[1]);


        //导入密文
        String ciphertext2 = st[0];
        //导入密钥
        String key2 = st[1];
        //进行解密
        String information2 = decode(ciphertext2, key2);
        //输出明文
        System.out.println("解析出明文为:" + information2);
    }


    //生成密钥
    public static String makekey(int length) {
        char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
                'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char temp;
        char[] key = new char[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int num = random.nextInt(26);
            key[i] = a[num];
        }
        //将字符数组转化为字符串
        StringBuilder sb = new StringBuilder();
        for (char c : key) {
            sb.append(c);
        }
        return sb.toString();
    }


    //加密算法
    public static String encrypt(String information, String key) {
        //将明文都转化为字符串数组
        int length = information.length();          //  明文长度
        char[] a = information.toCharArray();
        int[] c = new int[length];
        for (int i = 0; i < length; i++)
            c[i] = a[i];                                    //  明文数字数组
        String[] b = new String[length];                    //  存储所有明文的 二进制串
        for (int i = 0; i < length; i++) {
            b[i] = Integer.toString(c[i] & 255, 2);
            int len = b[i].length();
            for (int j = 8; j > len; j--)
                b[i] = "0" + b[i];
        }
        //将密钥转化为字符数组
        char[] d = key.toCharArray();
        int[] e = new int[length];
        for (int i = 0; i < length; i++)
            e[i] = d[i];                                    //  密钥数字数组
        String[] f = new String[length];                    //  存储所有密钥的 二进制串
        for (int i = 0; i < length; i++) {
            f[i] = Integer.toString(e[i] & 255, 2);
            int len_ = f[i].length();
            for (int j = 8; j > len_; j--)
                f[i] = "0" + f[i];
        }
        //进行异或比较
        String[] ciphertext = new String[length];                        //  密文串
        for (int i = 0; i < length; i++) {              //  对每位字符进行 异或加密 并保存起来
            char[] ch = b[i].toCharArray();             //  存储一个明文字符 的 8 位明文字符二进制数串
            char[] ch2 = f[i].toCharArray();            //  存储一个密钥字符 的 8 位密钥字符二进制数串
            char[] ch3 = new char[8];                   //  存储 一个密文字符 的 8 位二进制数
            for (int j = 0; j < 8; j++)
                ch3[j] = (ch[j] == ch2[j]) ? '0' : '1';
            StringBuilder sb = new StringBuilder();
            for (char c1 : ch3)
                sb.append(c1);
            ciphertext[i] = sb.toString();
        }
        //将加密后的 每个字符串二进制数组 转换为 数字，存到数组中
        int[] ciphertext_Int = new int[length];
        for (int i = 0; i < length; i++) {
            int num = binstrToInt(ciphertext[i]);                  //////////
            ciphertext_Int[i] = num;
        }
        //将数组转化为字符数组
        char[] ciphertext_Char = new char[length];
        for (int i = 0; i < length; i++)
            ciphertext_Char[i] = (char) (ciphertext_Int[i]);
        StringBuilder sb = new StringBuilder();
        for (char ch : ciphertext_Char)
            sb.append(ch);
        return sb.toString();
    }


    //解密算法
    public static String decode(String ciphertext2, String key2) {

        //  因为一个数  对  另一个数异或两次时，结果不变

        System.out.println("\n进入解密时:" + ciphertext2 + "   " + key2);
        return encrypt(ciphertext2, key2);
    }

    //文件输出方法
    public static void txtout(String information, String key) throws Exception {
        flushFile("ciphertext.txt");
        flushFile("key.txt");

        FileOutputStream fos1 = new FileOutputStream(new File("ciphertext.txt"));
        fos1.write(information.getBytes());
        fos1.close();

        FileOutputStream fos2 = new FileOutputStream(new File("key.txt"));
        fos2.write(key.getBytes());
        fos2.close();
    }

    //文件输入方法
    public static String[] txtInt() {
        String str_ciphertext = null;
        String str_key = null;
        try {
            FileInputStream fis1 = new FileInputStream(new File("ciphertext.txt"));
            str_ciphertext = read(fis1);
            FileInputStream fis2 = new FileInputStream(new File("key.txt"));
            str_key = read(fis2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String[]{
                str_ciphertext, str_key
        };
    }

    public static String read(FileInputStream fis) throws IOException {
        // 指定编码格式
        BufferedReader br = new BufferedReader(new InputStreamReader(fis, StandardCharsets.UTF_8));
        StringBuilder ret = new StringBuilder();
        String line = null;
        while ((line = br.readLine()) != null) {
            ret.append(line);
        }
        fis.close();
        return ret.toString();
    }

    public static void flushFile(String filename) {
        new File(filename).delete();
    }

    public static int binstrToInt(String binstr) {
        int ret = 0;
        for (int i = 7; i >= 0; --i) {
            //  这一位存的数
            int num = Integer.parseInt(binstr.charAt(7 - i) + "");
            ret += (num * (1 << i));
        }
        return ret;
    }
}

