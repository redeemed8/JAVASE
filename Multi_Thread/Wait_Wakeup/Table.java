package Multi_Thread.Wait_Wakeup;

public class Table {

    public static int foodFlag = 0;                 //  表示 桌子上是否有食物

    public static int count = 10;                   //  总个数：表示最多10碗饭

    public static Object lock = new Object();       //  锁对象

}
