package practice;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class 流式加密 {

    private static final Scanner SCANNER = new Scanner(System.in);

    private static final String KEY_FILENAME = "key.txt", PASSCODE_FILENAME = "passcode.txt";

    private static String sample, key = "", retStr;

    public static void main(String[] args) {
        init();
        System.out.println("明文是: " + sample);
        System.out.println("生成密钥: " + key);
        if (save(key, KEY_FILENAME)) {
            System.out.println("密钥已保存到文件中: " + KEY_FILENAME);
        }
        encrypt(sample, key);
        System.out.println("加密后的结果为: " + retStr);
        if (save(retStr, PASSCODE_FILENAME)) {
            System.out.println("密文已保存到文件中: " + PASSCODE_FILENAME);
        }
        decrypt(retStr, key);
        System.out.println("解密后的结果为: " + retStr);
    }

    private static void init() {
        sample = SCANNER.nextLine();
        Random random = new Random();
        int r;
        for (int i = 0; i < sample.length(); i++) {
            r = random.nextInt(1, 122);
            key += (char) r;
        }
    }

    private static void encrypt(String sample_, String key_) {
        StringBuilder sb = new StringBuilder(sample_);
        for (int i = 0; i < sample_.length(); i++) {
            sb.setCharAt(i, (char) (sample_.charAt(i) ^ key_.charAt(i)));
        }
        retStr = sb.toString();
    }

    private static void decrypt(String password_, String key_) {
        encrypt(password_, key_);
    }

    //  保存表到文件中
    public static boolean save(String str, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(new File(fileName))) {
            for (int i = 0; i < str.length(); ++i) {
                char ch = str.charAt(i);
                byte[] aByte = (ch + "").getBytes();

                String binStr = Integer.toBinaryString(aByte[0] & 0xff);
                int len = binStr.length();
                for (int j = 8; j > len; --j) {
                    binStr = "0" + binStr;
                }
                binStr += "\n";
                fos.write(binStr.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    //  解析文件
    public static String encode(String fileName) {
        FileInputStream fis = null;
        String ret = "";
        try {
            fis = new FileInputStream(new File(fileName));
            byte[] bytes = new byte[4];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                for (int i = 0; i < len; i++) {
                    ret += (char) bytes[i];
                }
            }
        } catch (IOException e) {
            System.out.println("文件解析失败!");
            e.printStackTrace();
            return null;
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        String newRet = ret.replace("\n", "");
        for (int i = 0; i < newRet.length() / 8; ++i) {
            String bin = newRet.substring(8 * i, 8 * i + 7);
            String retch = bin_to_num(bin);
            sb.append(sb);
        }
        return sb.toString();
    }

    public static String bin_to_num(String bin) {
        int ret = 0;
        for (int i = 0; i < bin.length(); ++i) {
            char ch = bin.charAt(i);
            if (ch == '1')
                ret += (1 << i);
        }
        return ((char) ret) + "";
    }

}
