package CommonlyUsedApi;

import java.util.Objects;

public class ObjectTest4 {
    public static void main(String[] args) {
        Student s1 = null;
        Student s2 = new Student("Xubojun", 8);

        //使用 Objects 工具类中的方法
        boolean ret = Objects.equals(s1, s2);       //先做非空判断，再比较
        //只要有一个是 null , 就返回 false
        System.out.println(ret);


        //判断类是不是 null 的方法   isNull()        nonnull()
        Student s3 = new Student();
        Student s4 = null;
        System.out.println(Objects.isNull(s3));         //false   s3 不是 null
        System.out.println(Objects.isNull(s4));         //true

        System.out.println(Objects.nonNull(s3));            //true
        System.out.println(Objects.nonNull(s4));            //false

    }
}
