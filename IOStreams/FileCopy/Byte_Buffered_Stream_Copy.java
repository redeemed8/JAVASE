package IOStreams.FileCopy;

public class Byte_Buffered_Stream_Copy {
    public static void main(String[] args) {
        //  相比普通文件输入输出会提高效率
        //  提高效率的原理：

        /*
        缓冲输入流 和 缓冲输出流 各有一个缓冲区
        read 方法是一个中间量，从缓冲输入流的缓冲区读出一个数据，再把自己写到缓冲输出流的缓冲区中
        上述因为是在内存中进行的操作，相比在硬盘和内存之间操作，快了不少

        一次一个字节相当于一个小人搬东西
        一次多个字节相当于一个小车搬东西

        */

    }
}
