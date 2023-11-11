package Multi_Thread;

public class Life_OF_Thread {
    public static void main(String[] args) {
        //  线程的生命周期

        //  先是创建线程对象      ---->                                                新建状态

        //  通过调用 start 方法 使线程变为                                             就绪状态
        //  这时 有执行资格 但没有执行权
        //  它在不停的抢 CPU

        //  当它抢到 CPU 的执行权的时候，他就进入了                                      运行状态(实际没有这个状态)
        //  它开始运行它的代码
        //  在这个期间，它的执行权随时可能被别的线程抢走，
        //  抢走后，他就又变回了 就绪状态，继续重新抢执行权
        //  或者，他被 sleep() 或者 其他阻塞式方法 阻塞了(说白了就是让你等会)
        //  他会进入 阻塞或者休眠状态，
        //  等 阻塞或者休眠状态 结束后，变回就绪状态，重新抢票(哈哈哈哈笑死我了)

        //  遇到 wait 进入等待状态
        //  没有执行资格，也没有执行权
        //  通过 notify 唤醒后，进入就绪状态

        //  sleep 又叫计时等待状态，
        //  没有执行资格，也没有执行权
        //  后变回就绪状态

        //  一个线程的所有代码都执行完毕后，
        //  线程死亡，变为垃圾，      ---->                                              死亡状态



    }
}