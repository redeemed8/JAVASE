package Multi_Thread.Thread_Pool;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        //for (int i = 0; i < 100; i++) {
            //System.out.println(Thread.currentThread().getName() + " --- " + (i + 1));
            System.out.println(Thread.currentThread().getName());
        //}

    }

}
