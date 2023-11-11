package SeniorArray.Map;

public class VariableParameters {
    //  可变参数
    public static void main(String[] args) {
        System.out.println(getSum());
        System.out.println(getSum(2));
        System.out.println(getSum(2, 4, 6, 7));
        //  细节
        //  可变参数是一个数组
        //  形参中最多只能写一个可变参数
        //  理解为一个大胖子，有多少吃多少
        //  必须放在形参的最后一个
    }

    public static int getSum(int... args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }

    public static int getSum2(int num, int... args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }

}
