package Multi_Thread.Thread_Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Create_ThreadPool {
    public static void main(String[] args) throws InterruptedException {
        //  获取一个没规定上限的线程池(其实上限是int最大值,再其实上限是你电脑的线程数)
        ExecutorService pool1 = Executors.newCachedThreadPool();
        //  提交任务
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);                     //  体现线程的复用性
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());

        //  销毁线程池,里面的所有线程也会全部消失
        //pool1.shutdown();

    }
}
