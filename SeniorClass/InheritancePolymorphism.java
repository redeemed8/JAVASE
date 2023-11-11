package SeniorClass;

public class InheritancePolymorphism {
    public static void main(String[] args) {
        //先创建一个狗
        Dog dog1 = new Dog();
        dog1.say();

        //用多态实现狗
        //使用父类指针指向子类对象
/*        Animal animal = new Dog();
        animal.say();*/

        //但是多态有一个弊端，就是无法调用子类中特有的方法
        //说白了， 不能直接使用 animal 来调用   “吃骨头”

        //要先把父类对象转换成相应的子类对象，才可以调用其特有的方法
/*        if(animal instanceof Dog)
        {
            ((Dog) animal).doThing();
        }
        else{
            System.out.println("无法转换");
        }*/

        dog1.swim();

        Cat cat1 = new Cat();
        cat1.swim();
        cat1.defaultMethod();
        Inter.staticMethod();

/*        Rabbit rabbit1 = new Rabbit();
        rabbit1.swim();*/



    }
}
