public class Insertion_DLL {
    public static class Node{
        int val;
        Node next ;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }

    public static Node insertAthead(Node head , int x  ){
        Node t = new Node (x);
        t.next = head;
        head.prev = t;
        head = t ;
        return head;
    }

    public static void insertAtTailk(Node head , int x ) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
    }
    public static void insertAtIdx(Node head , int idx , int val ) {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        Node m = temp.prev ;
        Node t = new Node(val);
        m.next = t;
        t.prev = m;
        t.next = temp;
        temp.prev = t;
    }


    public static void DelTail(Node head){
        Node temp = head ;
        while(temp.next.next != null){
            temp=temp.next;
        }
        temp.next = null;
    }
    public static Node DelHead(Node head){
       Node temp = head ;
       temp = temp.next; ;
       temp.prev = null;
       return temp;
    }
    public static void DelAtIndx(Node head , int idx ){
        Node temp = head ;
        for(int i =0 ; i<idx ; i++){
            temp = temp.next;
        }
        Node a = temp.prev ;
        a.next = temp.next ;
        temp.next.prev = a;
    }
    public static void DisplayAll(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // 4 10 2 99 13
        Node  a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.prev = null ;// not necessary beacuse its by default null;
        a.next = b;

        b.prev = a;
        b.next = c;

        c.prev = b;
        c.next = d;

        d.prev=c;
        d.next = e;

        e.prev=d;
        e.next = null;// not necessary because its by default null

            System.out.println("DLL before update ");
            DisplayAll(a);
            System.out.println("DLL after update ");

//            Node newHead = insertAthead(a,35);
//           DisplayAll(newHead);

//        insertAtIdx(a , 3 , 50);
//        DisplayAll(a);

//        DelTail(a);
//        DisplayAll(a);

//        DelAtIndx(a,2);


        Node newhead = DelHead(a);
        DisplayAll(newhead);
    }
}
