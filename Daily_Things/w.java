package Daily_Things;

import java.util.Random;

public class w {

    public static void main(String[] args) {
        System.out.println(dododo(28));

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(100));
        }

    }

    public static String dododo(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            //  奇数要小写字母，偶数要大写字母
            sb.append((char) ((random.nextInt(100) & 1) != 0 ?
                    97 + random.nextInt(100) % 26 : 65 + random.nextInt(100) % 26));
        }
        return sb.toString();
    }

    public static boolean int_to_boolean(int num) {
        return num != 0;
    }


}
