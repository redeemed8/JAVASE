package Multi_Thread.Implement_Method;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        //  书写线程要执行的代码
        //  先获取当前线程对象
        Thread t = Thread.currentThread();

        for (int i = 0; i < 10; i++) {
            System.out.println(t.getName() + "你好" + (i + 1));
            // System.out.println(Thread.currentThread().getName());
        }
    }

}
