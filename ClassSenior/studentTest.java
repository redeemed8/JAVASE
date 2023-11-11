package ClassSenior;

public class studentTest {
    public static void main(String[] args) {
        //创建第一个学生对象
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男");

        //static 成员                 //静态即共享
        Student.teacherName = "wwww";           //就算没有类对象，也可以先写出来

        //static 函数
        Student.Print();

        s1.study();
        s1.show();

        //创建第二个学生对象
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(56);
        s2.setGender("女");

        s2.study();
        s2.show();
    }


}
