package LInk;

public class LinkClass {
    public static void main(String[] args) {
        //LinkNode heed1 = new LinkNode();
        LinkNode head1 = null;
        head1 = add(head1,9);
        head1 = add(head1,9);
        head1 = add(head1,9);
        head1 = add(head1,9);
        head1 = add(head1,9);
        show(head1);
    }

    public static LinkNode add(LinkNode head,int data){
        //System.out.println("-------");
        LinkNode temp = head;       //存起来先
        if(head == null){
            LinkNode newNode = new LinkNode();
            newNode.data = data;
            head = newNode;
            return head;
        }
        //System.out.println("1111111111");
        while(temp.next != null){
            temp = temp.next;
        }
        //新建节点
        LinkNode newNode = new LinkNode();
        newNode.data = data;
        temp.next = newNode;
        return head;
    }

    public static void show(LinkNode head){
        while(head != null){
           // System.out.println("----------");
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}
