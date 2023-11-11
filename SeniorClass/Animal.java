package SeniorClass;

public abstract class Animal {
    //我们以动物为例，把 Animal 作为起始父亲，          //继承

    //其实，没有继承任何类的类，虚拟机会让他继承 Object 类

    //权限分为4种
    // private < 不写 < protected < public
    // private 修饰的成员变量只有本类中能使用
    // 不写  修饰的成员 只能在本包中使用
    // protected 修饰的成员 可以在非本包，但是继承了它的包中使用，，，，，，，，不在本包中，但是继承了含有protected的类
    //public 修饰的成员  通用

    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //行为
    public void say(){
        System.out.println("动物在说话！ 我是"+getName()+"  "+getAge()+"岁!");
    }

    //只能在类内使用  ↓
    private void secret(){
        System.out.println("这是属于Animal的秘密！");
    }

    //抽象方法
    public abstract void sleep();

}
