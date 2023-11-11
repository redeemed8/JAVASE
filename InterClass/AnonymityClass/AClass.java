package InterClass.AnonymityClass;

public class AClass {
    public static void main(String[] args) {
        //匿名对象
        new Swim(){                             //其实是有名字的，在文件夹可以看到多了一个含有 $ 的文件
            //又叫Swim接口的实现类对象
            @Override
            public void swim() {
                System.out.println("匿名对象在游泳!");
            }
        };              //最后要写一个分号



        //因为是实现类对象，所以可以接收它
        Swim s = new Swim(){                             //其实是有名字的，在文件夹可以看到多了一个含有 $ 的文件
            //又叫Swim接口的实现类对象
            @Override
            public void swim() {
                System.out.println("匿名对象在游泳!");
            }
        };//最后要写一个分号
        //使用
        s.swim();



        new Animal(){               //相当于写了一个 Animal 的子类
            //所以要重写方法
            @Override
            public void eat() {
                System.out.println("Animal的匿名孩子！");
            }
        };

        //应用场景
        Dog dog = new Dog();
        method(dog);
        //但是呢，如果这个Dog我只需要使用一次，这样写太麻烦
        method(
                new Animal(){                               //这样就不用去创建Dog类了
                    @Override
                    public void eat() {
                        System.out.println("狗池骨头");                     //相当于多态
                    }
                }
        );

    }

    public static void method(Animal a){                    //把Dog赋给Animal
        a.eat();
    }
}
