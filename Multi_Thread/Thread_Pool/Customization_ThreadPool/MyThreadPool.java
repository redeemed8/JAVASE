package Multi_Thread.Thread_Pool.Customization_ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPool {
    public static void main(String[] args) {
        //  自定义线程池
        /*
         核心元素一:核心线程数量               不能小于 0
         核心元素二:最大线程数                不能小于等于 0, 最大数量 >= 核心线程数量
         核心元素三:空闲线程的最大存活时间      不能小于 0
         核心元素四:时间单位                  用 TimeUnit 指定
         核心元素五:任务队列                  不能为 null
         核心元素六:创建线程工厂               不能为 null
         核心元素七:任务的拒绝策略             不能为 null
        */

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,      //  核心线程数量
                6,      //  有 3 个临时线程
                60,     //  空闲线程的最大存活时间
                TimeUnit.SECONDS,  //   时间单位
                new ArrayBlockingQueue<>(4),        //  任务队列
                Executors.defaultThreadFactory(),           //  创建线程工厂
                new ThreadPoolExecutor.AbortPolicy()        //  任务的拒绝策略     (是种内部类)
        );

        //  然后可以使用

    }
}
