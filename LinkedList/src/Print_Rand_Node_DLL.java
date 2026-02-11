public class Print_Rand_Node_DLL {
    public static class Node{
        int val;
       Node next ;
       Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static void DisplayAll(Node a){
        Node temp = a ;
        while(temp.prev!=null){
            temp = temp.prev;
        }

        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        // 4 10 2 99 13
        Node a = new Node(4);
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

        DisplayAll(c);
    }
}
