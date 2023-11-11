package Multi_Thread.Thread_Pool.Customization_ThreadPool;

public class GetThreadNumber {
    public static void main(String[] args) {
        //  向 Java 虚拟机返回可用处理器数目
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println(count);
        //  结果是 20 , Java是可以使用所有的线程资源的
    }
}
