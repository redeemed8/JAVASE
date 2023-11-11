package Multi_Thread.Member_Method.Yield_Thread;

public class yieldThread {
    public static void main(String[] args) {
        //  礼让线程 / 出让线程

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("飞机");
        t2.setName("大炮");

        t1.start();
        t2.start();

    }
}
