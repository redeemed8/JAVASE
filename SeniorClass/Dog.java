package SeniorClass;

public class Dog extends Animal implements Swim{

    public Dog() {
        this("无名狗",9);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    //在继承了父类后，可以改写父类的 public 函数  不改也可以
    public void say(){
        System.out.println("狗在说话！ 我是"+getName()+"  "+getAge()+"岁");
    }

    public void doThing(){
        System.out.println("吃骨头!");
    }

    //继承抽象类 必须重写抽象方法，不然无法实例化
    public void sleep(){
        System.out.println("狗在睡觉！");
    }

    @Override
    public void swim() {
        System.out.println("狗会游泳！");
    }
}
