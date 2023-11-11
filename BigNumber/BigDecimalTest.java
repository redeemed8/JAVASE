package BigNumber;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
    public static void main(String[] args) {
        //操作和  BigInteger  类似

        //所以我只写点不一样的东西

        BigDecimal b1 = new BigDecimal("0.99");
        System.out.println(b1);

        BigDecimal b2 = BigDecimal.valueOf(10.201);
        System.out.println(b2);

        //1. 除法
        BigDecimal b3 = BigDecimal.valueOf(10.0);
        BigDecimal b4 = BigDecimal.valueOf(3.0);

        BigDecimal b6 = b3.divide(b4,2, RoundingMode.HALF_UP);          //四舍五入
        System.out.println(b6);
        
        //比较
        BigDecimal b7 = BigDecimal.valueOf(9999.0);
        BigDecimal b8 = BigDecimal.valueOf(9999.00);
        System.out.println(b7.equals(b8));                                          //true

        BigDecimal b9 = new BigDecimal("99.987");
        BigDecimal b0 = new BigDecimal("99.987");
        System.out.println(b0.equals(b9));                                          //true

        
    }

}
