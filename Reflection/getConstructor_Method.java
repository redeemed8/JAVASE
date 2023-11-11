package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class getConstructor_Method {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //  获取构造方法
        //  Constructor  构造方法类

        /*
         Constructor<?>l getConstructors(): 返回所有公共构造方法对象的数组
         Constructor<?>ll getDeclaredConstructors(): 返回所有构造方法对象的数组
         Constructor<T> getConstructor(Class<?>...parameterTypes): 返回单个公共构造方法对象
         Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes): 返回单个构造方法对象

         Constructor类中用于创建对象的方法
         T newInstance(Object...initargs): 根据指定的构造方法创建对象
         setAccessible(boolean flag): 设置为true,表示取消访问检查
        */

        //  1. 获取 class 字节码文件
        Class<?> clazz = Class.forName("Reflection.Student");

        //  2. 从里面获取构造方法
        Constructor<?>[] cons = clazz.getConstructors();       //  获取所有的公共构造方法
        for (Constructor<?> con : cons) {
            System.out.println(con);
        }

        System.out.println("---------------------");

        Constructor<?>[] cons2 = clazz.getDeclaredConstructors();   //  获取所有的构造方法
        for (Constructor<?> con : cons2) {
            System.out.println(con);
        }

        System.out.println("---------------------");
        Constructor<?> con1 = clazz.getDeclaredConstructor();       //  括号里的参数字节码文件的类型 与 你想要的构造方法的参数类型一致
        System.out.println(con1);
        Constructor<?> con2 = clazz.getDeclaredConstructor(String.class);
        System.out.println(con2);
        Constructor<?> con3 = clazz.getDeclaredConstructor(int.class);
        System.out.println(con3);
        Constructor<?> con4 = clazz.getDeclaredConstructor(String.class, int.class);
        System.out.println(con4);

        System.out.println("---------------------");

        int modifiers = con1.getModifiers();            //  获取权限修饰符           可以在帮助1.6.0文档里搜索 常量字段值
        System.out.println(modifiers);                  //  1     public           然后下拉找到 常量字段值
        System.out.println(con2.getModifiers());        //  0     无修饰符          然后 Ctrl + F 搜索 reflect 关键字 即可
        System.out.println(con3.getModifiers());        //  4     protected
        System.out.println(con4.getModifiers());        //  2     private

        int parameterCount = con4.getParameterCount();          //  参数个数
        System.out.println("------------------\n参数个数：" + parameterCount + "\n-------------------");
        Class<?>[] parameterTypes = con4.getParameterTypes();   //  参数类型
        for (Class<?> p : parameterTypes) {
            System.out.println(p);
        }
        System.out.println("-------------------");
        Parameter[] parameters = con4.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }
        System.out.println("--------------------");

        //  创建对象
        con4.setAccessible(true);           //  临时取消 方法权限修饰符 的限制
        Student stu = (Student)con4.newInstance("张三", 18);      //  这是个私有构造
        System.out.println(stu);
    }
}
