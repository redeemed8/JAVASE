package Multi_Thread.Member_Method.Daemon_Threads;

public class MyThread1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "@" + (i + 1));
        }
    }
}
