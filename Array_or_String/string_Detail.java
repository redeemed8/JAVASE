package Array_or_String;

public class string_Detail {
    public static void main(String[] args) {
        String str1 = "asd";            //str1存储的是字符串的地址
        String str2 = "asd";            //这种直接赋值的，地址是存储在堆区的串池中的
        if(str1 == str2)
            System.out.println(true);
        else
            System.out.println(false);

        String s3 = "asd";              //存储在串池中
        String s4 = new String("asd");          //在堆区开辟一块内存，存进去（非串池）
        if(s3 == s4)
            System.out.println(true);
        else
            System.out.println(false);

        //因为s3 s4里存储的是地址，如果想要直接比较字符串的内容，↓
        boolean flag = s4.equals(s3);
        if(flag)
            System.out.println(true);
        else
            System.out.println(false);

        //也可以忽略大小写比较
        String s5 = "asd";
        String s6 = "ASD";
        if(s5.equalsIgnoreCase(s6))
            System.out.println(true);
        else
            System.out.println(false);

        //获取字串
        String str = "abcdefghijklmn";
        String str7 = str.substring(0,5);
        System.out.println(str7);

    }
}
