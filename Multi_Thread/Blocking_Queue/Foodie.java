package Multi_Thread.Blocking_Queue;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{

    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        while(true){
            if(Implement_Wait_Wakeup.count == 0){
                break;
            }else {
                //  不断地从阻塞队列中获取食物
                try {
                    String food = queue.take();
                    --Implement_Wait_Wakeup.count;
                    System.out.println(Thread.currentThread().getName() + "吃了一碗"
                            + food + "！！" + "还能吃 " + Implement_Wait_Wakeup.count + " 碗！！");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
