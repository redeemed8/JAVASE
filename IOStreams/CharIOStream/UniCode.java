package IOStreams.CharIOStream;

public class UniCode {
    public static void main(String[] args) {
        //  UniCode 又叫万国码
        //  UTF-8 用 1 ~ 4 个字节保存
        //  英文字母一个 字节          格式：0xxxxxxxx
        //  汉字3个字节               格式：1110xxxx 10xxxxxx 10xxxxxx

        //  乱码的原因一般有两种
        //  一是 读取时未能读完整个汉字
        //  二是编码和解码的格式不统一
    }
}
