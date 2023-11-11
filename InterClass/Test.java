package InterClass;

public class Test {
    public static void main(String[] args) {
        Basic car = new Basic();
        car.showBasic();
        car.show();

        //调用静态类中的静态方法
        Basic.StaticClass.show2();

        //调用静态类中的非静态方法
        Basic.StaticClass bs = new Basic.StaticClass();
        bs.show1();


    }
}
