package Multi_Thread.Safety_OF_Thread.SellTicket;

public class MyRunnable implements Runnable {

    int ticket = 0;         //  因为 MyRunnable 只创建一个，所以不用 static

    @Override
    public void run() {
        while (true) {
            if (method()) break;            //  注意 if 里面方法名要修改 和共享方法一致！
        }
    }

    //  抽离代码块快捷键
    //  Ctrl + Alt + m

    private synchronized boolean method() {
        if (ticket == 100) {
            return true;
        } else {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ++ticket;
            System.out.println(Thread.currentThread().getName() + "在卖第 " + ticket + " 张票!!!");
        }
        return false;
    }
}
