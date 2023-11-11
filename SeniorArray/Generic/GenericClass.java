package SeniorArray.Generic;

import java.util.Arrays;

//  泛型类
public class GenericClass <T> {

    Object[] obj = new Object[10];
    int size;

    public boolean add(T t){
        obj[size] = t;
        ++size;
        return true;
    }

    public T get(int index){
        return (T)obj[index];
        //  因为obj[index] 是 Object类型的 所以要强制转换成 T
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }

    //  在泛型类中我们可以使用通配符
    //   ? extends E    ? super E   来代替 T
    //      ? extend E  E为一个具体的类名  表示可传递E或所有E的子类
    //      ? super E   表示可以传递E或E所有的父类
}
