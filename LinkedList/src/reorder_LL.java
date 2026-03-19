import java.util.*;
public class reorder_LL {
    public static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList{
        Node reverse(Node head){
            if(head == null || head.next==null)return head;

            Node newhead = reverse(head.next);
            head.next.next = head;
            head.next = null;

            return newhead;
        }

        void reordered(Node head){
            Node slow = head;
            Node fast = head;
            while(fast.next!=null && fast.next.next!=null ){
                slow = slow.next;
                fast = fast.next.next;
            }

            Node newhead = reverse(slow.next);
            slow.next = null;

            Node lh = head;
            Node rh = newhead;
            Node Rnext , Lnext;
            while(lh!=null && rh!=null){
                Lnext = lh.next;
                lh.next = rh;
                Rnext = rh.next;
                rh.next = Lnext;

                lh=Lnext;
                rh=Rnext;
            }

        }

         void display(Node head){
            Node temp = head;
             while(temp!=null){
                 System.out.print(temp.data+" ");
                 temp = temp.next;
             }
             System.out.println();
         }
    }

        public static void main(String []args){
            Node x = new Node(1);
            Node y = new Node(2);
            Node z = new Node(3);
            Node n = new Node(4);
            Node f = new Node(5);
            Node g = new Node (6);
            x.next = y;
            y.next = z;
            z.next = n;
            n.next = f;
            f.next = g;
            g.next = null;
            LinkedList ll = new LinkedList();
            System.out.println("Before reorder");
            ll.display(x);
            ll.reordered(x);
            System.out.println("After reorder");
            ll.display(x);
        }

}
