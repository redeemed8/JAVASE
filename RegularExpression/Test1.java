package RegularExpression;

public class Test1 {
    public static void main(String[] args) {
        //正则表达式
        //用于判定字符串符不符合我想要的规范

        String rule1 = "[abc]";
        String t1 = "a";

        System.out.println(t1.matches(rule1));                          // true

        //  [^abc] 表示除abc外的任何字符
        System.out.println("abe".matches("[^cdf][^cdf][^cdf]"));            //true

        //[a-zA-z]  表示 a 到 z ， A 到 Z

        //[a-d[m-p]]        表示 a 到 d 或者 m 到 p

        //[a-z&&[def]]          // a 到 z 和 def 的交集

        //[a|b]                 //表示 a 或 b

        String r1 = "[a|b]";
        System.out.println("a".matches(r1));            //true

        String r2 = "[a&b]";
        System.out.println("b".matches(r2));            //true

        //预定义字符
        String r = "......";
        System.out.println("Aa2_+=".matches(r));                        //   .   表示任意字符

        //      \\d表示  任意一个数字   [0-9]
        //      \\D     非数字
        //      \\s     一个空白字符
        //      \\S        一个非空白字符
        //      \\w         英文数字下划线
        //      \\W         一个非单词字符

        //  X?    表示 x 至少出现 0 次 或者 1 次
        //  x*    表示 x 出现 0 次 或者多次
        //  x+    表示 x 至少出现一次
        //  x{n}  表示 x 正好出现 n 次
        //  x{n,} 表示 x 至少出现 n 次
        //  x{n, m} 表示 x 至少出现 n 次 但是不超过 m 次
    }
}
