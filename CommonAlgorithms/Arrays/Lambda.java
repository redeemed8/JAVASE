package CommonAlgorithms.Arrays;

import java.util.Arrays;

public class Lambda {
    public static void main(String[] args) {
        //用 lambda表达式 简化书写
        //   (形参) -> { 函数主体 }
        //  用于简化匿名内部类的书写
        //  只能简化函数式接口的匿名内部类的写法
        //  函数式接口： 有且只有一个抽象类的接口


        method(
                ()->{
                    System.out.println("hahahhahahahahaaha");
                }
        );




    }

    public static void method(doThing d){
        d.doThings();
    }

}

@FunctionalInterface
interface doThing{
    public abstract void doThings();
}
