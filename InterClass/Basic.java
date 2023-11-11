package InterClass;

public class Basic {
    //此处是外部类
    String carName;
    int carAge;
    String carColor;

    public Basic() {
        this.carName = "大货车" ;
        this.carAge = 18;
        this.carColor = "白色";
    }

    public void showBasic() {
        System.out.println("这是外部类的展示！" + carColor + carName + carAge);
    }

    public void show(Basic this) {
        System.out.println(this.carName);
        Engine e = new Engine();
        System.out.println(e.engineName + e.engineAge);
    }

    class Engine {              //属于成员内部类
        public Engine() {
            this.engineAge = 99;
            this.engineName = "发动只因";
        }

        //此处是内部类
        //内部类可以直接调用外部类的成员，包括私有
        //而外部类如果想要访问内部类的成员，需要创建对象
        String engineName;
        int engineAge;

        public void show() {
            System.out.println(engineName + engineAge);
        }

    }

    static class StaticClass{
        //此处是静态内部类。
        //在静态内部类中，只能访问外部类中的静态变量和静态方法
        //如果想要访问非静态的需要创建对象
        public void show1(){
            System.out.println("非静态");
        }

        public static void show2(){
            System.out.println("静态");
        }


    }


}
