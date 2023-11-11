package IOStreams.FileCopy;
import TimeCounter.Timer;
import java.io.*;

public class FileCopyDemo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\protjct\\1.png");        //  源地址
        FileOutputStream fos = new FileOutputStream("D:\\protjct\\aaa\\2.png");     //  拷贝到

        Timer timer = new Timer();                      //  执行时间类

        //  拷贝
        int len;
        byte[] bytes = new byte[1024 * 1024 * 5];       //  一次拷贝 5MB
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        timer.getTime();                //  只要 花费几毫秒

        //  释放资源
        fos.close();
        fis.close();

    }
}
