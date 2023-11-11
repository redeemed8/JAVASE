package Multi_Thread.Member_Method;

public class Priority_of_Thread {
    public static void main(String[] args) {
        //  线程的 优先级
        //  抢占式调度 --- 体现了随机性
        //  非抢占式调度 --- 轮流执行
        //  线程可以设置优先级   1 ~ 10  默认为 5
        //  优先级越高，抢占 CPU 的 概率越高

        //  创建线程要执行的参数对象
        MyRunnable mr = new MyRunnable();
        //  创建线程对象
        Thread t1 = new Thread(mr,"飞机");
        Thread t2 = new Thread(mr,"大炮");

        //  查看优先级，默认为 5
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        //  查看 main 线程的优先级      也是 5
        System.out.println(Thread.currentThread().getPriority());

        System.out.println("---------------------");

        //  设置优先级
        t1.setPriority(1);          //  飞机
        t2.setPriority(10);         //  大炮
        //  优先级只是概率问题，不是必然的

        t1.start();
        t2.start();

    }
}
