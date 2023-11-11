package ClassSenior;

//继承  用extends      注意最后有 s
//java不支持多继承，只能单继承哈哈哈
public class BoyStudent extends Student{

    private String clothes = "男生的衣服";

    //不能直接继承构造函数
    public BoyStudent(String name, String gender, int age) {
        //不写默认调用父类 无参构造
        super(name, gender, age);
    }

    //可以继承父类所有的变量

    //只可以继承 public 方法

    public void say(){
        System.out.println("我是男孩子。");
    }

    public void wear(){
        System.out.println("我会穿"+clothes);
    }

    //在子类中重写父类的方法
    @Override
    public void doThing(){
        System.out.println("哈哈哈哈哈caocaocaocao");
    }


}
