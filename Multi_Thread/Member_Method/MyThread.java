package Multi_Thread.Member_Method;

public class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //  如果我们没有给线程起名字，它自己也是有名字的 Thread-x
            System.out.println(getName() + " @ " + (i + 1));
        }
    }
}
