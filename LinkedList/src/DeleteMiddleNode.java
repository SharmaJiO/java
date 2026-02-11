import java.awt.*;

public class DeleteMiddleNode {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        public static class LinkedList{
            Node head = null;
            Node tail = null;

            public void Display(Node head){
                Node temp = head;
                while(temp!=null){
                    System.out.println(temp.data);
                    temp=temp.next;
                }
            }

           public static Node middle(Node head){
               Node slow=head;
               Node  fast = head;
               while(fast.next.next!=null && fast.next.next.next!=null){
                   slow = slow.next;
                   fast=fast.next.next;
               }
               return slow;
           }
        }
        public static void main(String[]args)
        {
          Node a = new Node(4);
            Node b = new Node(10);
            Node c = new Node(2);
            Node d = new Node(99);
            Node e = new Node(13);
            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            e.next=null;
            LinkedList ll = new LinkedList();
ll.Display(a);
Node mid=ll.middle(a);
        }    }
}
