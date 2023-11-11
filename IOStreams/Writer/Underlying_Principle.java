package IOStreams.Writer;

public class Underlying_Principle {
    public static void main(String[] args) {
        //  writer 的底层原理

        //  会把数据先写到缓冲区中，
        //  如果缓冲区满了，会刷新到本地文件
        //  如果使用 flush()    也会刷新到本地文件
        //  或者直接关闭 close   也会刷新到本地文件并且关闭文件
    }
}
