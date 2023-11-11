package Multi_Thread.Blocking_Queue;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{

    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        while(true){
            if(Implement_Wait_Wakeup.count == 0){
                break;
            }else {
                //  不断的把面条放到阻塞队列当中
                try {
                    queue.put("面条");
                    System.out.println(Thread.currentThread().getName() + "做了一碗面条！！");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
