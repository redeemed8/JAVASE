package LInk;

public class Test {
    public static void main(String[] args) {
        //我想直接创建一个10个元素的链表
        LinkNode head = new LinkNode();
        head.data = 198;
        head.next = null;
        LinkNode tail = head;
        for(int i = 0; i < 10; ++i){
            //先创建一个节点
            LinkNode newNode = new LinkNode();
            newNode.next = null;
            newNode.data = i;
            tail.next = newNode;
            tail = newNode;
        }

        show(head);
    }

    public static void show(LinkNode head){
        while(head != null){
            // System.out.println("----------");
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}
