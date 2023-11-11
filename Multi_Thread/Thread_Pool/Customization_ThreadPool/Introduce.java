package Multi_Thread.Thread_Pool.Customization_ThreadPool;

import java.util.concurrent.ThreadPoolExecutor;

public class Introduce {
    public static void main(String[] args) {
        //  自定义线程池 的 7 个 参数
        /*
         核心元素一:正式员工数量                        核心线程数量
         核心元素二:餐厅最大员工数                      线程池中最大线程的数量
         核心元素三:临时员工空闲多长时间被辞退(值)        空闲时间(值)
         核心元素四:临时员工空闲多长时间被辞退(单位)      空闲时间(单位)
         核心元素五:排队的客户                         阻塞队列
         核心元素六:从哪里招人                         创建线程的方式
         核心元素七:当排队人数过多，超出顾客请下次再来(拒绝服务)         要执行的任务过多时的解决方案
        */

        //  核心线程 > 队伍长度 > 临时线程
        //  只有核心线程都在工作,而且队伍已经排满了
        //  这时,临时线程才会创建
        //  所以,任务在执行的时侯 不一定 按照提交的顺序执行

        //  如果 提交任务的数量 > 核心 + 队伍长度 + 临时
        //  会触发任务拒绝策略

        //  4 种拒绝策略
        //  ThreadPoolExecutor.AbortPolicy          丢弃任务并抛出RejectedExecutionException异常
        //  ThreadPoolExecutor.CallerRunsPolicy     调用任务的run()方法绕过线程池直接执行
        //  ThreadPoolExecutor.DiscardOldestPolicy  抛弃队列中等待最久的任务 然后把当前任务加入队列中
        //  ThreadPoolExecutor.DiscardPolicy        丢弃任务，但是不抛出异常 这是不推荐的做法


    }
}
