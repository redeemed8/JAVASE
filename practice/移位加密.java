package practice;

import java.util.Scanner;

public class 移位加密 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean encrypt = encrypt();
        if (encrypt) {
            System.out.println("加密成功!");
        }
        boolean decrypt = decrypt();
        if (decrypt) {
            System.out.println("解密成功!");
        }
    }

    public static boolean encrypt() {
        System.out.print("请输入你的明文: ");
        String sample_in = scanner.nextLine();
        StringBuilder sampleBuilder = new StringBuilder(sample_in);
        System.out.print("请输入你的密钥: ");
        String key = scanner.nextLine();
        if (!key.chars().allMatch(Character::isDigit)) {
            System.out.println("密钥输入有误，只能是一个数字！");
            return false;
        }
        int keyNum = Integer.parseInt(key);
        //  进行加密
        for (int i = 0; i < sample_in.length(); ++i) {
            sampleBuilder.setCharAt(i, (char) (((sampleBuilder.charAt(i) - 'a' + keyNum) % 26) + 'a'));
        }
        System.out.println("加密后的结果为: " + sampleBuilder.toString());
        return true;
    }

    public static boolean decrypt() {
        System.out.print("请输入你的密文: ");
        String sample_in = scanner.nextLine();
        StringBuilder sampleBuilder = new StringBuilder(sample_in);
        System.out.print("请输入你的密钥: ");
        String key = scanner.nextLine();
        if (!key.chars().allMatch(Character::isDigit)) {
            System.out.println("密钥输入有误，只能是一个数字！");
            return false;
        }
        int keyNum = Integer.parseInt(key);
        //  进行解密
        for (int i = 0; i < sample_in.length(); ++i) {
            sampleBuilder.setCharAt(i, (char) (((sampleBuilder.charAt(i) - 'a' - keyNum + 26) % 26) + 'a'));
        }
        System.out.println("解密后的结果为: " + sampleBuilder.toString());
        return true;
    }

}
