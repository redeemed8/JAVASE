package RegularExpression;

public class OtherFunc {
    public static void main(String[] args) {
        //public String replaceAll(String regex, String newStr)                     //按照正则表达式的规则进行替换
        //public String[] split(String regex)                                       //按照正则表达式的规则进行切割字符串

        String str = "小红djksjdkjkj1224152小黄dsdhusdhush45454小白jdisdis";

        String ret = str.replaceAll("[\\w&&[^_]]+","Vs");       //替换
        System.out.println(ret);

        String s = "小红A小黄A小白";
        String[] ret2 = s.split("A");                   //常规切割
        for(String s1:ret2){
            System.out.println(s1);
        }

        //按照正则表达式切割
        str = "小红djksjdkjkj1224152小黄dsdhusdhush45454小白jdisdis";
        String[] ret3 = str.split("[\\w&&[^_]]+");
        for(String s1:ret3){
            System.out.println(s1);
        }

    }
}
