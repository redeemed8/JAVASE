package Multi_Thread.Member_Method.joinThread;

public class joinThread {
    public static void main(String[] args) throws InterruptedException {
        //  插入线程

        MyThread t = new MyThread();
        t.setName("土豆");
        t.start();

        //  表示把 t 这个线程，插入到当前线程之前
        //  当前线程：join的代码是运行在哪个线程上的
        //  作用：将 土豆线程插入到 main 线程之前，等土豆线程里的代码全部执行完毕，才轮到 main 线程执行
        t.join();

        //  执行在 main 线程当中的
        for (int i = 0; i < 10; i++) {
            System.out.println("main" + (i + 1));
        }



    }
}
