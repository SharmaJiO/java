//Using recurssion
public class Reverse_linklist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
  
    public static Node reverse(Node head){
        if(head.next==null) return head;
        Node newhead = reverse(head.next);
        head.next.next = head;// interchanging connections
       head.next=null;
        return newhead;
    }


    public static void display(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        display(head.next);
    }


    public static void main(String[] args) {
       Node x = new Node(3);
        Node y = new Node(4);
        Node z = new Node(5);
        Node n = new Node(6);
        x.next = y;
        y.next = z;
        z.next = n;
        n.next = null;
        display(x);
        System.out.println();
        Node r = reverse(x);
        display(r);
          }
}
