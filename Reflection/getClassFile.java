package Reflection;

public class getClassFile {
    public static void main(String[] args) throws ClassNotFoundException {
        //  获取 class 对象的三种方式

        //  ① Class.forName("全类名")
        //  ② 类名.class
        //  ③ 对象.getClass()

        //  先写 java 文件 然后再编译成  class 字节码文件
        //             源代码文件  ↑
        //  然后把字节码文件加载到内存中 -----  加载阶段          //  可以使用第二种方法
        //  也可以在内存中创建这个类的对象     ---     运行阶段   //   可以使用第三种方法

        //  1. 第一种  ----  常用
        //  全类名 = 包名 + 类名     Reflection.Student
        Class<?> clazz = Class.forName("Reflection.Student");

        //  打印
        System.out.println(clazz);

        //  2. 第二种  ----  更多的是作为参数使用
        Class<Student> clszz2 = Student.class;
        System.out.println(clszz2 + "----" + (clszz2 == clazz));

        //  3. 第三种  ----  当我们已经有了这个类的对象时才可以使用
        Student s = new Student();
        Class clazz3 = s.getClass();
        System.out.println(clazz3);
        System.out.println((clazz3 == clazz) + "---" + (clazz3 == clszz2));

        //  三种方法获取到的字节码文件都是一样的
    }
}
