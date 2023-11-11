package IOStreams.ByteInput;

import java.io.FileInputStream;
import java.io.IOException;

public class InputDetail {
    public static void main(String[] args) throws IOException {
        //  创建对象
        //  细节： 指定文件不存在，就直接报错
        FileInputStream fis = new FileInputStream("D:\\protjct\\test.txt");

        //  读取数据
        //   一次读取一个字节，返回 ASCII 值(int)， 读到末尾返回 -1 ，并且移动文件光标

        //  释放资源


    }
}
