package Exception;

public class UsualMethod {
    public static void main(String[] args) {
        //  异常中的常见方法
        /*
        String getMessage()     返回此 throwable 的详细消息字符串
        String toString()       返回此可抛出的简短描述
        void printStackTrace()  把异常的错误信息输出在控制台      但是并不会结束虚拟机
         */

        int[] arr = {1, 2, 3, 4, 5, 6};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String s1 = e.getMessage();
            String s2 = e.toString();
            System.out.println(s1);
            System.out.println(s2);
            e.printStackTrace();
        }

        System.out.println("哈哈哈哈哈哈哈");

        //  用来打印错误信息的语句
        System.err.println("我是错误的");

    }
}
