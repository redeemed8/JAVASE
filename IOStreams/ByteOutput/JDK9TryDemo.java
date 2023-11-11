package IOStreams.ByteOutput;

import java.io.*;

public class JDK9TryDemo {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("D:\\protjct\\test.txt");
        FileOutputStream fos = new FileOutputStream("D:\\protjct\\aaa\\test09.txt");
        //  自动释放资源，不必掌握。
//        try (fis;fos) {
//            //  拷贝
//            int len;
//            byte[] bytes = new byte[1024 * 1024 * 5];
//            while ((len = fis.read(bytes)) != -1) {
//                fos.write(bytes, 0, len);
//            }
//        }catch(IOException e){
//            e.printStackTrace();
//        }
    }
}
