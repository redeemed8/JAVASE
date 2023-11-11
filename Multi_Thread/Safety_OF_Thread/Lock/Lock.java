package Multi_Thread.Safety_OF_Thread.Lock;

public class Lock {
    public static void main(String[] args) {
        //  普通锁是自动开关，不能手动

        //  JDK5 以后 有了锁对象 Lock

        //  可以手动上锁和开锁
        //  lock()  上锁
        //  unlock()    开锁

        //  Lock是接口不能实例化，这里采用它的实现类 ReentrantLock 来实例化

    }
}
