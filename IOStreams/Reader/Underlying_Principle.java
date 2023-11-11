package IOStreams.Reader;

import java.io.*;

public class Underlying_Principle {
    public static void main(String[] args) throws IOException {

        //  当第一次调用 read 方法时，会把本地文件中的数据先加载到一个8192大小的数组中，我们称这个数组是缓冲区
        //  在后来的调用 read 方法时，文件指针会在缓冲区里动
        //  当缓冲区里所有的数据都被读完时，会返回 -1
        //  也只有当缓冲区里的数据读完时,会重新将刚才加载剩下的数据放到缓冲区里.直到全部读完

    }
}
