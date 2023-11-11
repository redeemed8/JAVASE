package CommonlyUsedApi;

public class ObjectTest3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //                                              对象克隆 ↑ 必须写

        //创建对象
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        User u1 = new User(1, "张三", "1234qwer", "girl11", data);

        //System.out.println(u1.toString());

        //克隆对象
        //细节:
        //方法在底层会帮我们创建一个对象，并把原对象的数据拷贝过去
        //书写细节:
        //1. 重新Object 中的 clone 方法
        //2. 让 javabean 类实现Cloneable接口
        //3. 创建原对象并调用 clone 就可以了
 /*       User u2 = (User)u1.clone();

        System.out.println(u1);
        System.out.println(u2);*/

        //浅克隆有一个弊端
        //就是克隆出来的类，不是完全独立的
        //一个被修改了，另一个也会跟着改变

        //深克隆
        User u3 = (User) u1.clone();

        //修改其中一个的属性
        int[] tData = u1.getData();
        tData[0] = 99999;

        System.out.println(u1);
        System.out.println(u3);

    }
}
