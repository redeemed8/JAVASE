package SeniorClass;

public class Cat extends Animal implements Swim,Inter{
    //现在要实现多态
    public Cat() {
        this("无名猫",10);
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    //要重写父类中的 虚函数   虚函数必须重写
    @Override
    public void sleep() {
        System.out.println("修猫也要睡觉！");
    }


    @Override
    public void swim() {
        System.out.println("修猫会游泳");
    }
}
