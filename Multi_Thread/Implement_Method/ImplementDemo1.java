package Multi_Thread.Implement_Method;

public class ImplementDemo1 {
    public static void main(String[] args) {
        //  第一种实现方式，继承 Thread 类进行实现
        //  ①自己定义一个类，继承 Thread
        //  ②重写 run 方法
        //  创建子类对象，并启动线程

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        //  给线程起一个名字
        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();     //  开启线程
        t2.start();     //  开启线程


    }
}
