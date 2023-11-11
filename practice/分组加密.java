package practice;

import java.util.Scanner;

public class 分组加密 {

    private static final Scanner SCANNER = new Scanner(System.in);

    private static String sample, key, retStr;

    public static void main(String[] args) {
        initSample();
        encrypt();
        System.out.println(retStr);
        decrypt(retStr);
        System.out.println(retStr.replaceAll("#",""));
    }

    public static void initSample() {



        sample = SCANNER.next();
        key = SCANNER.next();
        if (!sample.chars().allMatch(Character::isLetter)) {
            System.out.println("明文必须是字母!");
            return;
        }
        if (!key.chars().allMatch(Character::isLetter)) {
            System.out.println("密钥必须是字母!");
            return;
        }
        int smp_len = sample.length(), key_len = key.length();
        if (smp_len / key_len != smp_len % key_len + key_len) {
            //  说明此处要补齐 #
            int addNum = key_len - smp_len % key_len;
            for (int i = 0; i < addNum; i++) {
                sample += "#";
            }
        }
    }

    public static void encrypt() {
        StringBuilder sb = new StringBuilder(sample);
        int index;
        for (int i = 0; i < sample.length() / key.length(); i++) {
            for (int j = 0; j < key.length(); j++) {
                index = i * key.length() + j;
                char ch;
                if (sb.charAt(index) == '#') {
                    ch = (char) ('#' + (key.charAt(j) - 96));
                } else {
                    ch = (char) ((sample.charAt(index) - 'a' + key.charAt(j) - 96) % 26 + 'a');
                }
                sb.setCharAt(index, ch);
            }
        }
        retStr = sb.toString();
    }

    public static void decrypt(String password) {
        StringBuilder sb = new StringBuilder(password);
        int index;
        for (int i = 0; i < sample.length() / key.length(); i++) {
            for (int j = 0; j < key.length(); j++) {
                index = i * key.length() + j;
                char dLitter = sb.charAt(index);
                if (dLitter <= ('#' + 26) && dLitter > '#') {
                    sb.setCharAt(index, '#');
                    continue;
                }
                char ch = (char) ((password.charAt(index) - 'a' - (key.charAt(j) - 96) + 26) % 26 + 'a');
                sb.setCharAt(index, ch);
            }
        }
        retStr = sb.toString();
    }

}
