package IOStreams.OtherIOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Encrypt {
    public static void main(String[] args) throws IOException {
        //  文件加密        使用异或
        FileInputStream fis = new FileInputStream("D:\\protjct\\aaa\\2.png");
        FileOutputStream fos = new FileOutputStream("D:\\protjct\\aaa\\secret");

        byte[] bytes = new byte[1024 * 1024];          // 1 MB
        int len;
        while ((len = fis.read(bytes)) != -1) {
            //  对数组数据加密
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] ^= 2;
            }
            fos.write(bytes, 0, len);
        }

        fos.close();
        fis.close();

    }
}
