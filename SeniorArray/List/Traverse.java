package SeniorArray.List;
import java.util.*;
public class Traverse {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < 10; ++i)
            list.add(i);

        //  1. 迭代器
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.print(i + " ");
        }
        System.out.println();

        //  2. 增强 for
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();

        //  3. Lambda 表达式
        list.forEach(num -> System.out.print(num + " "));
        System.out.println();

        //  4. 普通 for 循环
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        //  5. 列表迭代器
        ListIterator<Integer> it2 = list.listIterator();
        while(it2.hasNext()){
            Integer i = it2.next();
            if(i == 4) {
                it2.add(555);                           //在遍历时可以添加元素            运用迭代器本身的方法 add
            }
            else if(i == 7){
                it2.remove();
            }
        }
        System.out.println(list);







    }
}
