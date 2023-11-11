package Multi_Thread.Thread_Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Create_ThreadPool2 {
    public static void main(String[] args) {

        //  获取一个没规定上限的线程池(其实上限是int最大值,再其实上限是你电脑的 CPU 和 内存性质)
        ExecutorService pool1 = Executors.newFixedThreadPool(3);
        //  提交任务
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        //  如果提交任务时,池子中没有空闲线程,也无法创建新的线程,任务就会排队等待
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());

        //  销毁线程池,里面的所有线程也会全部消失
        //pool1.shutdown();                     //  不调用,这个线程池里的线程不会消失


    }
}
