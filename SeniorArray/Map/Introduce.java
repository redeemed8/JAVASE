package SeniorArray.Map;

import java.util.HashMap;
import java.util.Map;

public class Introduce {
    public static void main(String[] args) {
        /*
            此类是 Map 容器类的顶级接口
            接口不能直接创建对象，要创建实现类对象
        */

        //  创建对象
        Map<String, String> map1 = new HashMap<>();

        //  添加元素  put（）
        map1.put("小111","大111");                //  键值对
        map1.put("小333","大333");
        map1.put("小222","大222");

        /*
        在添加数据时，如果键存在，会覆盖原有键值对对象，并且返回被覆盖的值
            如果键不存在，直接添加，方法会返回 null
        */

        //  删除
        String s1 = map1.remove("小222");
        System.out.println("s1 == " + s1);                  //  返回被删除的值

        //  clear 清空

        //  判断是否包含
        boolean b1 = map1.containsKey("小333");          //  判断键
        System.out.println(b1);
        boolean b2 = map1.containsValue("大333");          //  判断值
        System.out.println(b2);

        //  判空
        System.out.println(map1.isEmpty());

        //  大小
        System.out.println(map1.size());

        //  获取  get（键）
        String ret = map1.get("小111");
        System.out.println("get == " + ret);

        //  直接打印
        System.out.println(map1);



    }
}
