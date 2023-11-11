package SeniorArray.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Traverse {
    public static void main(String[] args) {
        //  遍历

        Collection<Integer> coll = new ArrayList<>();
        coll.add(1);
        coll.add(2);
        coll.add(3);
        coll.add(4);
        coll.add(7);
        coll.add(6);
        coll.add(8);
        coll.add(9);

        //  1. 迭代器遍历        Iterator

/*        迭代器默认指向集合的 0 索引
          hasNext()       判断当前位置是否有元素。
          next()          获取当前位置的元素，并将迭代器对象移向下一个位置。
          迭代器遍历时，不能用集合的方法进行增加或者删除
          要用迭代器方法remove删除       */

        //定义一个迭代器
        Iterator<Integer> it = coll.iterator();
        //boolean flag = it.hasNext();
        while(it.hasNext()){
            //  ↑  当前位置不为空的时候
            int data = it.next();           //  获取元素并且移动指针 = =//
            if(data == 7)
                it.remove();            //  删除 7
            System.out.print(data + " ");
        }
        System.out.println();


        // 2. for 循环遍历
        /*     不能修改，只能看元素     */
        for (int data : coll) {
            System.out.print(data + " ");
        }
        System.out.println();


        //  3.Lambda 表达式            forEach
/*        coll.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer + " ");
            }
        });*/
        //  简化 ↓
        coll.forEach(num -> System.out.print(num + " "));



    }

}
