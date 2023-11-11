package Multi_Thread.Wait_Wakeup;

public class Test {
    public static void main(String[] args) {
        //  实现线程轮流交替执行的效果

        //  创建线程对象
        Producer p = new Producer();
        Consumer c = new Consumer();


        //  起名字
        p.setName("厨师250");
        c.setName("吃货520");


        //  开启线程
        p.start();
        c.start();


    }
}
