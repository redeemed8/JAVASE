package Multi_Thread.Wait_Wakeup;

public class Producer extends Thread {
    //  生产者实现
    @Override
    public void run() {

        while (true) {
            synchronized (Table.lock) {
                if (Table.count == 0) {
                    //  全部吃完
                    break;
                } else {
                    //  核心逻辑
                    //  判断桌子上是否有食物
                    if (Table.foodFlag == 1) {
                        //  有就等待
                        try {
                            Table.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        //  没有就制作
                        System.out.println(Thread.currentThread().getName() + "做了一碗面条!!");
                        //  修改桌子上的食物状态
                        Table.foodFlag = 1;
                        //  叫醒等待的吃货开吃
                        Table.lock.notifyAll();
                    }
                }


            }
        }


    }
}
