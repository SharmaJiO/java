public class Del_nthNodeFromLast {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist {
        Node head = null;
        Node tail = null;

        int size(Node head) {
            Node tem = head;
            int count = 0;
            while (tem != null) {
                count++;
                tem = tem.next;
            }
            return count;
        }

        void FromLast(Node head, int idx) {
            Node temp = head;
            int b = size(temp) - idx + 1;
//            for(int i = 1 ; i<b-1 ; i++) {
//                temp = temp.next ;
//            }
//              temp.next=temp.next.next;

            Node p = temp.next;
            for (int i = 1; i < b - 1; i++) {
                temp = temp.next;
                p = p.next;
            }
            temp.next = p.next;
        }

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
        Node x = new Node(100);
        Node y = new Node(102);
        Node z = new Node(103);
        Node f = new Node(104);
        x.next = y;
        y.next = z;
        z.next=f;
        linkedlist nn = new linkedlist();
        nn.display(x);
        nn.FromLast(x,2);
        nn.display(x);
    }
         }



