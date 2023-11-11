package SeniorArray.Generic;

public class GenericInterfaceTest implements GenericInterface<Integer>{
    /*
    * 泛型接口的两种使用方式
    * 1.实现类给出具体的类型
    * 2.实现类延续泛型，创建实现类对象时再确定类型
    */
    @Override
    public void print1(Integer integer) {
        System.out.println(integer);
    }

}
