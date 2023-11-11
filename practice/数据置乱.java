package practice;

import java.io.*;
import java.util.*;

public class 数据置乱 {

    private static final String FILENAME = "table.txt";

    private static final Scanner SCANNER = new Scanner(System.in);

    private static ArrayList<Integer> shuffleTable;

    private static String sample, retStr;

    public static void main(String[] args) throws IOException {
        //  输入明文
        sample = SCANNER.nextLine();
        //  生成置乱表
        shuffleTable = new ArrayList<>(sample.length());

        for (int i = 0; i < sample.length(); i++) {
            shuffleTable.add(i + 1);
        }
        Collections.shuffle(shuffleTable);

        System.out.println("---------置乱表-----------");
        System.out.println(shuffleTable);
        System.out.println("明文: " + sample);
        System.out.println("----------加密-----------");
        encrypt(sample);
        System.out.println("加密后的结果是: " + retStr);
        System.out.println("----------解密-----------");
        decrypt(retStr);
        System.out.println("解密后的结果是: " + retStr);
    }

    //  加密
    public static boolean encrypt(String sampleStr) {
        retStr = sampleStr;
        StringBuilder sb = new StringBuilder(retStr);
        for (int i = 0; i < sampleStr.length(); i++) {
            sb.setCharAt(shuffleTable.get(i) - 1, sampleStr.charAt(i));
        }
        retStr = sb.toString();
        return true;
    }

    //  解密
    public static boolean decrypt(String sampleStr) {
        StringBuilder sb = new StringBuilder(sampleStr);
        for (int i = 0; i < sample.length(); i++) {
            sb.setCharAt(i, sampleStr.charAt(shuffleTable.get(i) - 1));
        }
        retStr = sb.toString();
        return true;
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

    //  从文件中解析表
    public static List<Integer> extract() throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        FileInputStream fis = new FileInputStream(new File(FILENAME));
        byte[] bytes = new byte[4];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            for (int i = 0; i < len; i++) {
                list.add((int) (bytes[i] - 48));
            }
        }
        return list;
    }

}
