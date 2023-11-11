package Multi_Thread.Thread_Pool.Customization_ThreadPool;

public class Introduce2 {
    public static void main(String[] args) {
        //  线程池多大合适呢?

        /*
        项目一般可以分为两个类型

        ①cpu 密集型运算           最大并行数 + 1  ----- 我的电脑 20 + 1
            计算比较多

        ②I/O 密集型运算
             IO操作比较多          最大并行数 * 期望cpu利用率 * 总时间(cpu计算时间+等待时间) / cpu计算时间
        */

        /*
        4 核 8 线程
        4 个大脑
        可以虚拟成 8 个
        最大并行数 为 8
        */


    }
}
