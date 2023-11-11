package ClassTest;

import java.lang.reflect.Array;

public class IntegerTest {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);           //true                //和大数字容器一样，Integer类中会为你包装好一些常用的数字

        // -128 到 127 之间的数字已经包装好了       除此之外的数都要重新开辟空间来存储
        //而 == 号比较的是  引用数据类型的地址
        //所以上面是 true  下面是 false

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);           //false

        // 进制转换
        String s1 = Integer.toBinaryString(5);              //二
        System.out.println(s1);
        String s2 = Integer.toOctalString(16);              //八
        System.out.println(s2);
        String s3 = Integer.toHexString(16);                //十六
        System.out.println(s3);

        // 数字转字符串
        String str = Integer.toString(10929);
        System.out.println(str);

        //字符串转数字
        Integer num = Integer.parseInt("10929");
        System.out.println(num);
    }
}
