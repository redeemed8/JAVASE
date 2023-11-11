package BigNumber;

import java.math.BigInteger;

public class BigIntegerTest {
    public static void main(String[] args) {
        //直接代入字符串，可以认为这个数是无限大的
        BigInteger bi1 = new BigInteger("123456789000");
        //可以直接打印
        System.out.println(bi1);

        //第二种构造方法
        BigInteger bi2 = new BigInteger("9",10);            //第二个参数表示进制的意思
        System.out.println(bi2);

        //静态方法获取对象
        BigInteger bi3 = BigInteger.valueOf(3);
        System.out.println(bi3);
        //注意：这种静态方法有优化
        //1. 范围： 不能超过 long 的范围
        //2. 再创建-16 到 16 的时候，类内部已经为你创建好了，你可以直接拿来使用。
        //3. 超过 16或者-16 的部分才会重新开辟空间

        //证明
        BigInteger bi4 = BigInteger.valueOf(16);
        BigInteger bi5 = BigInteger.valueOf(16);

        System.out.println(bi4 == bi5);                 //true

        BigInteger bi6 = BigInteger.valueOf(17);
        BigInteger bi7 = BigInteger.valueOf(17);

        System.out.println(bi6 == bi7);                 //false             //说明是另开辟的空间

        //方法
        BigInteger b1 = new BigInteger("10");
        BigInteger b2 = new BigInteger("20");

        BigInteger b3 = b1.add(b2);                               //加法
        System.out.println(b3);

        BigInteger b4 = b1.subtract(b2);
        System.out.println(b4);                                    //减法

        BigInteger b5 = b1.multiply(b2);                           //乘法
        System.out.println(b5);

        BigInteger b6 = b2.divide(b1);                              //除法
        System.out.println(b6);

        BigInteger[] b7 = b2.divideAndRemainder(b1);                    //获取商和余数
        System.out.println(b7[0] + "   " + b7[1]);

        //其他方法

/*      public BigInteger pow(int num)                                      //幂
        public boolean equals(Object x)                                     //比较是否相等
        public BigInteger max/min(BigInteger val)                           //返回其中较大的数
        public int intValue(BigInteger val)                                 //转换成int型的，但是不能出界
*/
    }
}
