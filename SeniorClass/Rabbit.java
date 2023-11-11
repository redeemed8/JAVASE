package SeniorClass;

public class Rabbit extends Animal implements Swim{

    public Rabbit(){
    }

    @Override
    public void sleep() {
        //重写父类抽象方法
        System.out.println("兔子在睡觉！");
    }

    //实现接口方法
    @Override
    public void swim() {
        System.out.println("兔子不会游泳！");
    }

}
