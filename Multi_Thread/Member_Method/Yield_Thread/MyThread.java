package Multi_Thread.Member_Method.Yield_Thread;

public class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "@" + (i + 1) );
            //  表示出让当前 CPU 的执行权
            //  使 运行地 尽可能均匀一点
            Thread.yield();
        }
    }
}
