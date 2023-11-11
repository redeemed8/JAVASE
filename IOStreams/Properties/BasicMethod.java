package IOStreams.Properties;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class BasicMethod {
    public static void main(String[] args) {
        //  基本方法

        Properties prop = new Properties();     //  没有泛型，可以添加任意类型数据

        //  虽然可以添加任意的数据类型，但是我们一般只放字符串
        prop.put("aaa","AAA");
        prop.put("bbb","BBB");
        prop.put("ccc","CCC");
        prop.put("ddd","DDD");

        //  遍历集合
        Set<Object> keys = prop.keySet();
        for (Object key : keys) {
            Object value = prop.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println("----------------------");

        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + " = " + value);
        }

    }
}
