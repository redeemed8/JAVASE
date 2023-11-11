package Multi_Thread.Safety_OF_Thread.SellTicket;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread_Lock extends Thread {

    static int ticket = 0;

    static Lock lock = new ReentrantLock();         //  锁对象

    @Override
    public void run() {

        while (true) {
            lock.lock();
            try {
                if (ticket == 100) {
                    break;
                } else {
                    Thread.sleep(50);
                    ++ticket;
                    System.out.println(Thread.currentThread().getName() + "在卖第 " + ticket + " 张票!!!");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();              //  防止最后的锁不开
            }
        }

    }

}
