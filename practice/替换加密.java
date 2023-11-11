package practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 替换加密 {

    private static final String FILENAME = "password.txt";

    private static final Scanner scanner = new Scanner(System.in);

    private static String sample;

    private static String retStr;

    private static List<String> list;

    private static final String seed = "0,1,2,3,4,5,6,7,8,9," +
            "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
    private static final String seed2 = seed.replaceAll(",", "");

    public static void main(String[] args) {
        sample = scanner.next();
        list = Arrays.asList(seed.split(","));
        Collections.shuffle(list);

        System.out.println("明文是: " + sample);
        System.out.println("密钥是: " + list);
        encrypt();
//        save(list.toString());
        save(list.toString().substring(1, 3 * list.size() - 1)
                .replaceAll(",", "")
                .replaceAll(" ", "")
        );
        System.out.println("加密结果是: " + retStr);
        encode();
        System.out.println("解密结果是: " + retStr);
    }

    public static void encrypt() {
        StringBuilder sb = new StringBuilder(sample);
        for (int i = 0; i < sample.length(); i++) {
            char ch = sb.charAt(i);
            int index = -1;
            if ((ch + "").chars().allMatch(Character::isDigit)) {
                index = (int) (ch - '0');
            } else {
                index = (int) (ch - 'a' + 10);
            }
            sb.setCharAt(i, list.get(index).charAt(0));
        }
        retStr = sb.toString();
    }

    public static void encode() {
        StringBuilder sb = new StringBuilder(retStr);
        int index = -1;
        for (int i = 0; i < retStr.length(); i++) {
            char ch = sb.charAt(i);
            index = list.indexOf(ch + "");
            sb.setCharAt(i, seed2.charAt(index));
        }
        retStr = sb.toString();
    }

    //  保存表到文件中
    public static boolean save(String str) {
        try (FileOutputStream fos = new FileOutputStream(new File(FILENAME))) {
            fos.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
