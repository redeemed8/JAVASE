package IOStreams.ByteInput;

import java.io.FileInputStream;
import java.io.IOException;

public class CycleRead {
    public static void main(String[] args) throws IOException {
        //  循环读取

        //  创建对象
        FileInputStream fis = new FileInputStream("D:\\protjct\\test.txt");

        //  开始循环
        int b;
        while((b = fis.read()) != -1){
            System.out.print((char)b);
        }

        //  释放资源
        fis.close();

    }
}
