package ClassTest;

import java.lang.String;

//1234567
//佰拾万千佰拾元

public class test01 {
    public static void main(String[] args) {
        String s = "999999";
        String str = "佰拾万千佰拾元";
        String ret = "";
        //将char转换成int,再转换成大写
        for (int i = 0; i < s.length(); ++i) {
            int num = s.charAt(i) - '0';
            String capStr = getCapital(num);
            ret = ret + capStr;
        }
        //System.out.println(ret);

        for (int i = 0; i < 7 - s.length(); ++i) {
            ret = "零" + ret;
        }
        //System.out.println(ret);

        String sss = "";
        for (int i = 0; i < 7; ++i) {
            sss = sss + ret.charAt(i) + str.charAt(i);
        }
        System.out.println(sss);

    }

    public static String getCapital(int num) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[num];
    }


}
