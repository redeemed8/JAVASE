package IOStreams.Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BasicOf_IOStream2 {
    public static void main(String[] args) throws IOException {
        //  读取
        Properties prop = new Properties();

        FileInputStream fis = new FileInputStream("D:\\protjct\\test23.properties");
        prop.load(fis);         //  加载到集合中

        fis.close();

        //  打印集合
        System.out.println(prop);

    }
}
