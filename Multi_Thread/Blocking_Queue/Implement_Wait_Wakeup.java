package Multi_Thread.Blocking_Queue;

import java.util.concurrent.ArrayBlockingQueue;

public class Implement_Wait_Wakeup {
    static int count = 10;
    public static void main(String[] args) {
        //  细节：生产者 和 消费者 同用一个阻塞队列
        //  所以我们把阻塞队列创建在测试类中
        //  然后在厨师和吃货的类里，通过创建对象的方式调用即可

        //  创建阻塞队列对象
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        //  创建线程对象，并把阻塞队列对象传递过去
        Cook c = new Cook(queue);
        Foodie f = new Foodie(queue);

        //  起名
        c.setName("厨师250");
        f.setName("吃货520");

        //  开启线程
        c.start();
        f.start();

    }

}
