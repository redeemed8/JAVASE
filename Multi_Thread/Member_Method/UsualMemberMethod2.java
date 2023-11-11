package Multi_Thread.Member_Method;

public class UsualMemberMethod2 {
    public static void main(String[] args) {
        //  创建线程对象
        MyThread t1 = new MyThread("飞机");
        MyThread t2 = new MyThread("大炮");

        //  开启线程
        t1.start();
        t2.start();

        /*
         * 细节：
         * 当 JVM 虚拟机启动后，会自动的启动多条线程
         * 其中有一条线程就叫做 main 线程
         * 他的作用就是调用 main 方法，并执行里面的代码
         * 在以前，我们写的所有的代码，其实都是运行在 main 线程当中的
         * */

        //  哪条线程执行到这个方法，此时获取的就是哪个线程对象
        System.out.println(Thread.currentThread().getName());
    }
}
