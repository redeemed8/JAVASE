package ClassSenior;

public class Student {
    //属性
    private String name;
    private String gender;
    private int age;
    public static String teacherName;              //加了static的成员变量， 可以被所有成员共享， 只赋值一次 就可以全体使用

    /*
    public Student() {
        System.out.println("父类的无参构造");
    }
    */
    // ↑ 如果把构造函数写成private 外界就不能创建类对象

    public Student(){
        this("无","无",100);  //调用本类其他构造      //但是要自己确认参数并且写进去
        //在这里没有super()      //因为下面↓有了
    }

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        //在这里有super()       //继承它的父类  成员和虚方法表
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //行为
    public void study() {
        System.out.println(this.name + "正在学习!");
    }

    public void show() {
        System.out.println(name + ", " + age + ", " + gender + ", " + teacherName);
    }

    //静态方法
    public static void Print() {
        //静态方法 只能访问 静态变量 和 静态方法
        //System.out.println(name);     //name 非静态
        System.out.println(teacherName);
        System.out.println("you success！");
        //静态方法中无this关键字
    }

    //类对象不可直接使用，只能在类内部的方法中使用
    private void doThings() {
        System.out.println("干事情");
    }

    public void doThing(){
        System.out.println("哈哈哈哈哈");
    }


}
