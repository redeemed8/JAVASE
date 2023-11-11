package Multi_Thread.Safety_OF_Thread.Lock;

public class DeadLock {

    public static void main(String[] args) {
        //  死锁
        //  不是一个知识点，是一种错误！！
        //  是一种嵌套的锁
        //  就是说在 A锁 里 还有个 B锁
        //       在 B锁 里 还有个 A锁
        //  两个锁 互相等待对方开锁才能执行自己
        //  所以就这样一直等下去，直接卡死
        //  所以尽量别让两个锁嵌套在一起
    }


}
