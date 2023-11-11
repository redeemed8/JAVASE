package LInk;

import java.util.*;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //System.out.println(list);

        //重新添加
        //先创建一个链表
        LinkNode h = new LinkNode();
        //先添加一个数据
        h.data = list.get(0);
        h.next = null;
        LinkNode tail = h;           //添加使用的尾指针
        for(int i = 1; i < list.size(); ++i){
            //先创建一个节点
            LinkNode newNode = new LinkNode();
            newNode.next = null;
            newNode.data = list.get(i);
            tail.next = newNode;
            tail = newNode;
        }



        show(h);



    }
    public static void show(LinkNode head){
        while(head != null){
            // System.out.println("----------");
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}
