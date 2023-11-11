package Multi_Thread.Implement_Method;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ImplementDemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //  对前面两种方式的补充
        //  因为前两种方式没有 返回值

        //  ① 创建一个 MyCallable 类 实现Callable接口
        //  ② 重写 call 有返回值，表示多线程的运行结果
        //  ③ 创建 MyCallable 的对象, 表示多线程要执行的任务
        //  ④ 创建 Future 的对象，作用管理多线程运行的结果
        //  ⑤ 创建 Thread 的对象, 表示线程，并启动

        //  创建一个 MyCallable 对象
        MyCallable mc1 = new MyCallable();
        MyCallable mc2 = new MyCallable();

        //  创建 Future 的对象，作用管理多线程运行的结果
        FutureTask<String> ft1 = new FutureTask<>(mc1);
        FutureTask<String> ft2 = new FutureTask<>(mc2);

        //  创建线程对象
        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2);

        t1.setName("线程1");
        t2.setName("线程2");

        //  启动线程
        t1.start();
        t2.start();

        //  获取线程结果
        String ret1 = ft1.get();
        String ret2 = ft2.get();
        System.out.println("-------------");
        System.out.println(ret1);
        System.out.println(ret2);


    }
}
