package Multi_Thread.Member_Method;
import TimeCounter.Timer;

public class UsualMemberMethod3 {
    public static void main(String[] args) throws InterruptedException {
        //  sleep 休眠

        /*
        * 细节：
        * 哪条线程执行到了这个方法，那么哪条线程就会在这里停留对应的时间
        * 参数就表示睡眠的时间，单位毫秒
        * 当时间到了之后，线程会自动的醒来，继续执行下面的其他代码
        * */


        MyThread t1 = new MyThread("飞机");
        MyThread t2 = new MyThread("大炮");
        t1.start();
        t2.start();

        //  因为执行这两步的时间比较短，所以先打印这个了
        Timer t = new Timer();
        System.out.println("1111111111111");

        //  等待的时候，另外两个线程开始交替
        Thread.sleep(5000);
        System.out.println("2222222222222");
        t.getTime();


    }
}
