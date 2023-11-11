package practice;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class 进制转换 {

    private static final Scanner scanner = new Scanner(System.in);

    private static final String[] fullString = {"void", "0000000", "000000", "00000", "0000", "000", "00", "0"};

    public static void main(String[] args) {
        System.out.print("请输入你的明文: ");
        String sample = scanner.nextLine();
        String result = "";
        byte[] bytes = sample.getBytes(StandardCharsets.UTF_8);
        String[] bins = new String[sample.length()];
        String[] hexs = new String[sample.length()];
        int i = 0;
        for (byte aByte : bytes) {
            //  二进制
            String binStr = Integer.toBinaryString(aByte & 0xff);
            bins[i] = fullString[binStr.length()] + binStr;
            //  十六进制
            hexs[i++] = Integer.toHexString(aByte & 0xff);
        }
        System.out.println("二进制:");
        for (String bin : bins) {
            System.out.print(bin + " ");
        }
        System.out.println("\n十六进制:");
        for (String hex : hexs) {
            System.out.print(hex + " ");
        }
    }

}
