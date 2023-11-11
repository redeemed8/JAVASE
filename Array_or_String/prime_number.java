package Array_or_String;

public class prime_number {
    public static void main(String[] args) {
        boolean flag = false;
        for(int i=2;i<=100;++i)
        {
            flag = false;
            for(int j = 2; j < i; ++j)
            {
                if(i % j == 0)
                    flag = true;
            }
            if(!flag)
                System.out.print(i+" ");
        }
    }
}
