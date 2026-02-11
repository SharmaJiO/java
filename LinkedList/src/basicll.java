public class basicll {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
//        public static void display(Node head) {
//            Node temp = head;
//        for(int i=4 ; i>=1 ; i--)
//        {
//            System.out.println(temp.data);
//            temp=temp.next;
//        }
//        }


    public  static void display(Node head)
    {
        if(head == null) {
            return;
        }
        else{
            System.out.println(head.data);
            display(head.next);
        }
    }


             // For finding length of  linked ist
    public static int length(Node a)
    {
        int count = 0;
       while(a != null){
           count++;
           a=a.next;
       }
       return count;
    }

    //        node temp = x;
//        for(int i=3 ; i>=1 ; i--)
//        {
//            System.out.println(temp.data);
//            temp=temp.next;
//        }
//    }
//}

    public static void main(String[] args) {
        Node x = new Node(5);
        Node y = new Node(6);
        Node b = new Node(9);
        Node f = new Node(2);
        x.next = y; // node x linked to y
        y.next = b;
        b.next = f;
        display(x);
        int length=length(x);
        System.out.println("Length of given linked list is "+length);
    }
}

