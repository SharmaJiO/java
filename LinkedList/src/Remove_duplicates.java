import java.sql.SQLOutput;

public class Remove_duplicates {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

        public static class LinkedList{
            Node head = null;
            Node tail = null;

             void Remove_d(Node head) {
                 if (head == null) return ;
                 Node temp1 = head;
                 Node temp2 = head.next;
                 while(temp2!= null ){
                     if (temp1.data != temp2.data  ) {
                         temp1.next = temp2;
                         temp1 = temp2;
                     }
                     temp2 = temp2.next;
                 }
//                 Ensure the last unique element points to null
                 temp1.next=null;
             }
//            Node current = head;
//            Node nextNode = head.next;
//
//            while (nextNode != null) {
//                if (current.data == nextNode.data) {
//                    current.next = nextNode.next; // Skip duplicate node
//                } else {
//                    current = nextNode; // Move to the next unique node
//                }
//                nextNode = nextNode.next; // Move nextNode forward
//            }

            void display(Node head) {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
       Node x = new Node(3);
        Node y = new Node(3);
        Node z = new Node(4);
        Node n = new Node(4);
        Node e = new Node(5);
        Node r = new Node(5);
        Node t = new Node(6);
        Node h = new Node(6);
        x.next = y;
        y.next = z;
        z.next = n;
        n.next = e;
        e.next=r;
        r.next=t;
        t.next=h;
        LinkedList ll = new LinkedList();
        System.out.println("-----ORIGINAL LINKED LIST-----");
        ll.display(x);
        System.out.println("-----UPDATED  LINKED LIST-----");
        ll.Remove_d(x);
        ll.display(x);
    }
    }

