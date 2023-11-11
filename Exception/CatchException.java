package Exception;

public class CatchException {
    public static void main(String[] args) {
        //  目的：当代码出现异常时，不会结束代码
        int[] arr = {1, 2, 3, 4, 5};
        try {
            //  这里写可能出现异常的代码
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("索引越界了");
        }
        System.out.println("我出来咯");

        //  如果一个try中可能有多个类型不同的异常
        //  可以多写几个 catch 来捕获
        //  如果捕获的异常中存在父子关系，要把父亲写在下面








    }
}
