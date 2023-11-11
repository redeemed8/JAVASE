package SeniorClass;

public interface Inter {
    //实现接口的默认方法

    //默认方法不是抽象方法，所以不强制被重写，但是如果要重写，重写时要去掉default关键字
    //public 可以省略  但是 default 不能省略
    //如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对该方法进行重写

    //public abstract void say();

    // 默认方法 example
    public default void defaultMethod(){
        System.out.println("我是默认方法哈哈哈！");
    }

    //接口里的静态方法
    public static void staticMethod(){
        System.out.println("我来了！");
    }


}
