// Odd even linked list
public class Splited_linkedList {
    public static class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;

        void split(Node head){
            Node temp = head;
            Node a = new Node(20);
                    Node temp1=a;
            Node b = new Node(22);
            Node temp2=b;
            while ((temp!=null)){
                if(temp.data % 2 == 0 ){
                    temp1.next=temp;
                    temp1=temp1.next;
                }
                else{
                    temp2.next=temp;
                    temp2=temp2.next;

                }
                temp=temp.next;
            }
            // Terminate the lists to avoid cycles
            temp1.next = null;
            temp2.next = null;
            System.out.println("Even List:");
            display(a.next); // Skip dummy node

            System.out.println("Odd List:");
            display(b.next); // Skip dummy node
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
        Node x = new Node(3);
        Node y = new Node(4);
        Node z = new Node(5);
        Node n = new Node(6);
        x.next = y;
        y.next = z;
        z.next = n;

        linkedlist ll = new linkedlist();
        System.out.println("Normal linked list");
        ll.display(x);
        System.out.println("Splited linked list");
        ll.split(x);
    }
}
