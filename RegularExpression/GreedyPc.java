package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyPc {
    public static void main(String[] args) {
        //贪婪爬取 和 非贪婪爬取

        String str = "abbbbbbbbbbzzzzzaaaabbbbbbbbb";

        // 贪婪爬取 ： 尽可能多的爬取   ab+
        String regex = "ab+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while(m.find()){
            System.out.println(m.group());
        }

        // 非贪婪爬取 ： 尽可能少的获取          ab+?
        System.out.println("-------------------------");
        String regex2 = "ab+?";
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(str);
        while(m2.find()){
            System.out.println(m2.group());
        }

    }
}
