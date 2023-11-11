package MathApi;

//水仙花数
public class ZiMiShu {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 100; i < 1000; ++i){
            if(decide(i))
                count++;
        }
        System.out.println(count);
    }

    public static boolean decide(int num){
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
        return sum == num;
    }

}
