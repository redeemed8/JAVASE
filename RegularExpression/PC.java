package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PC {
    public static void main(String[] args) {
        //爬取本地信息
        //寻找所有的  Java××

        String str = "哈哈哈我Java123来了哈哈Java2哈我又走了哈哈哈Java哈哈我又回来Java14了！！！！哈哈哈哈哈哈Java20啊哈哈啊哈Java2150哈";        //待搜索的字符串

        // Pattern : 正则表达式
        // Matcher : 文本匹配器，作用按照正则表达式的规则去读取字符串，从头开始读取
        //              在大串中去找符合匹配规则的字串

        // 获取正则表达式的对象
        Pattern p = Pattern.compile("Java\\d{0,2}");
        // 获取文本匹配器的对象
        Matcher m = p.matcher(str);

        //拿着文本匹配器从头开始读取，寻找是否有满足规则的字串
        //boolean b = m.find();
        while (m.find()) {
            //然后方法底层会根据find方法记录的索引进行字符串的截取
            //运用substring来把截取的小串返回
            String s1 = m.group();
            System.out.println(s1);
        }



    }
}
