package Multi_Thread.Wait_Wakeup;

public class Consumer extends Thread {
    //  消费者实现
    @Override
    public void run() {
        /*
         * 1.循环
         * 2.同步代码块
         * 3.判断共享数据是否到了末尾（到了）
         * 4.判断共享数据是否到了末尾（没到，执行核心逻辑）
         * */
        while (true) {
            synchronized (Table.lock) {

                if (Table.count == 0) {
                    //  全部吃完
                    break;
                } else {
                    //  核心逻辑，没吃完
                    //  先判断桌子上是否有面条
                    if (Table.foodFlag == 0) {
                        //  如果没有就等待
                        try {
                            Table.lock.wait();      //  让当前线程和锁进行绑定
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        //  如果有就开吃
                        //  把吃的总数 -1
                        --Table.count;
                        System.out.println(Thread.currentThread().getName() + "正在吃食物，还能再吃 " + Table.count + " 碗!!");
                        //  吃完之后，唤醒厨师继续做
                        Table.lock.notifyAll();     //  唤醒绑定在这把锁上的所有线程
                        //  修改桌子上的食物状态(有或者没有)
                        Table.foodFlag = 0;
                    }

                }


            }
        }


    }
}
