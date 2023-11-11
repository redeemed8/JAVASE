package Multi_Thread.Safety_OF_Thread.SyncCode;

public class SyncMethod {
    public static void main(String[] args) {
        //  同步方法，
        //  把 synchronized 写在 返回值类型 前面
        //  synchronized 返回值类型

        //  特点1：同步方法是锁住方法里面所有的代码
        //  特点2：锁对象不能自己指定

        //  如果方法是非静态的       锁对象就是 this  当前方法的调用者
        //  如果方法是静态的        锁对象就是当前类的字节码文件对象

        //  这也是 StringBuffer 和 StringBuilder 的区别

        //  StringBuffer 的方法是带有 synchronized 的

    }
}
