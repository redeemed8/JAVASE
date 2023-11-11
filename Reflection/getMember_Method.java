package Reflection;

public class getMember_Method {
    public static void main(String[] args) {
        //  Method       成员方法类

        /*
         Class类中用于获取成员方法的方法
         Method[] getMethods(): 返回所有公共成员方法对象的数组，包括继承的
         Method[] getDeclaredMethods(): 返回所有成员方法对象的数组，不包括继承的
         Method getMethod(String name, Class<?>... parameterTypes): 返回单个公共成员方法对象
         Method getDeclaredMethod(String name, Class<?>... parameterTypes): 返回单个成员方法对象

         Method类中用于创建对象的方法
         Object invoke(Object obj, Object... args): 运行方法
         参数一:用obi对象调用该方法
         参数二:调用方法的传递的参数(如果没有就不写)
         返回值:方法的返回值(如果没有就不写)
        * */
    }
}
