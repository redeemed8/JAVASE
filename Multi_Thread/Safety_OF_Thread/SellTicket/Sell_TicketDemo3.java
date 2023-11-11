package Multi_Thread.Safety_OF_Thread.SellTicket;

public class Sell_TicketDemo3 {
    public static void main(String[] args) {
        //  三个窗口 卖 100 张票
        MyThread_Lock t1 = new MyThread_Lock();
        MyThread_Lock t2 = new MyThread_Lock();
        MyThread_Lock t3 = new MyThread_Lock();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        //  开启线程
        t1.start();
        t2.start();
        t3.start();
    }
}
