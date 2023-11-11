package CommonlyUsedApi;

public class ObjectTest2 {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");

        System.out.println(s.equals(sb));               //false
        //因为 equals 方法是 字符串s 调用的
        //所以会先检查参数是不是字符串，如果不是直接返回 false
        //如果参数是字符串，才会比较字符串的内容


        System.out.println(sb.equals(s));               //false
        //因为 equals 是容器 sb 调用的
        //而在 StringBuilder 中并没有 equals 方法，
        //所以它会去 StringBuilder 的默认父类 object 中寻找 equals
        //找到之后，使用object中的 equals 方法来比较
        //而object 中的 equals 方法是比较地址值，所以返回false

    }
}
