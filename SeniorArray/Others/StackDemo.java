package SeniorArray.Others;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        /*
        * Stack类里面主要实现的有以下的几个方法：
        *
        *  (1)boolean empty( )方法是判断堆栈是否为空。
        *
        *  (2)Object peek( )方法是返回栈顶端的元素，但不从堆栈中移除它。
        *
        *  (3)Object pop( )方法是移除堆栈顶部的对象，并作为此函数的值返回该对象。
        *
        *  (4)Object push (Object element)方法是把元素压入栈。
        *
        *  (5)int search(Object element)方法是返回对象在堆栈中的位置，它是以1为基数。是从栈顶往下数的
        *
        * */

        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(11);
        s.push(12);
        s.push(13);
        s.push(14);
        s.push(15);

        int pos = s.search(15);
        System.out.println(pos);        //  1

        //  直接打印
        System.out.println(s);

    }
}
