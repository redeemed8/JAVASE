package SeniorArray.Generic;

public class GenericClassTest {
    public static void main(String[] args) {
        GenericClass<String> g = new GenericClass<>();
        g.add("aaa");
        g.add("bbb");
        g.add("ccc");

        System.out.println(g);

    }
}
