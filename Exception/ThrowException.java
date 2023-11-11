package Exception;

public class ThrowException {
    public static void main(String[] args) {
        //  异常的抛出处理


        //  throws  写在方法定义处，表示声明一个异常
        //  告诉调用者，使用本方法可能会有哪些异常
        //  public void 方法() throws 异常类名1，异常类名2...{
        //  .....
        //  }


        //  throw   写在方法内，结束方法
        //  手动抛出异常对象，交给调用者
        //  方法中下面的代码不再执行了

    }

    //  这个throws可以省略不写
    //  运行时的异常 throws 可以不写
    public static int getMax(int[] arr) throws NullPointerException, ArrayIndexOutOfBoundsException {
        if (arr == null) {
            throw new NullPointerException();
        }
        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
