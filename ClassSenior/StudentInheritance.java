package ClassSenior;

//测试请在主函数中写哈
public class StudentInheritance {
    public static void main(String[] args) {
        //定义一个男孩子
        BoyStudent boy = new BoyStudent("王伟亮", "男", 10);
        System.out.println("年龄" + boy.getAge());

        boy.doThing();

        //继承方法给自己用，用来修改自己继承来的属性 哈哈哈
        boy.setName("大笨蛋");
        System.out.println("我现在的名字是"+boy.getName());
    }
}
