package CommonlyUsedApi;

public class ObjectTest {
    public static void main(String[] args) {
        Student s1 = new Student("修猫", 18);

        System.out.println(s1.toString());                      //打印类的成员属性

        Student s2 = s1;
        System.out.println(s1.equals(s2));              //true

        Student s3 = new Student("修猫", 18);
        System.out.println(s3.equals(s1));                  //true

        Student s4 = new Student("修猫", 99);
        System.out.println(s1.equals(s4));                  //false


    }
}
