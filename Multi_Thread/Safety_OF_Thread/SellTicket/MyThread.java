package Multi_Thread.Safety_OF_Thread.SellTicket;

public class MyThread extends Thread {

    static int ticket = 0;          //  0 ~ 99

    //  锁对象一定要是唯一的 ↓      加 static
    static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //  同步代码块
            //  锁对象是任意的  非常任意
            //  一般我们写 当前类的字节码文件 .class
            synchronized (MyThread.class){
                if (ticket < 100) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ++ticket;
                    System.out.println(getName() + "正在卖第" + ticket + "张票!!");
                } else {
                    break;
                }
            }
        }
    }

}
