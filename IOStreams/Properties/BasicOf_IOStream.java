package IOStreams.Properties;

import java.io.*;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class BasicOf_IOStream {
    public static void main(String[] args) throws IOException {
        //  结合 IO 流 的操作

        Properties prop = new Properties();
        prop.put("aaa","AAA");
        prop.put("bbb","BBB");
        prop.put("ccc","CCC");
        prop.put("ddd","DDD");

        //  把集合中的数据以键值对的形式写到本地文件中
        /*BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\protjct\\test23.properties"));
        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            bw.write(key + " = " + value);
            bw.newLine();
        }
        bw.close();*/           //  旧方法
        FileOutputStream fos = new FileOutputStream("D:\\protjct\\test23.properties");
        prop.store(fos,"test");           //  保存到本地的方法    //  第二个参数是注释
        fos.close();

    }
}
