package MathApi;

public class PrimeNumber {
    public static void main(String[] args) {

        for(int i = 2; i < 100; ++i)
            if(decide(i))
                System.out.println(i);

    }

    public static boolean decide(int num) {
        for (int i = 2; i < Math.sqrt(num); ++i) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

}
