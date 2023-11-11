package Multi_Thread.Member_Method.Daemon_Threads;

import Multi_Thread.Member_Method.MyThread;

public class Daemon_Threads {
    public static void main(String[] args) {
        //  守护线程

        //  细节：
        //  当其他的非守护线程执行完毕后，守护线程会陆续结束

        //  通俗易懂：
        //  当女神线程结束了，那么备胎也没有存在的必要了
        //  不是立马结束，会多执行一小会 （留恋）

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.setName("女神");                               //  没设置就是非守护
        t2.setName("备胎");

        //  把第二个线程设置成守护线程。。。。。。备胎线程
        t2.setDaemon(true);

        t1.start();
        t2.start();

    }
}
