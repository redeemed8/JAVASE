package Multi_Thread.Implement_Method;

public class ImplementDemo2 {
    public static void main(String[] args) {
        //  第二种实现方式   实现 Runnable 接口
        //  ① 自己定义一个类实现 Runnable 接口
        //  ② 重写里面的 run 方法
        //  ③ 创建自己的类对象
        //  ④ 创建一个 Thread 类的对象，并开启线程

        //  创建对象
        //  表示多线程要执行的任务
        MyRunnable myt1 = new MyRunnable();
        MyRunnable myt2 = new MyRunnable();

        //  创建线程对象
        Thread t1 = new Thread(myt1);
        Thread t2 = new Thread(myt2);

        //  设置线程名字
        t1.setName("线程1 ");
        t2.setName("线程2 ");

        //  开启线程
        t1.start();
        t2.start();


    }
}
