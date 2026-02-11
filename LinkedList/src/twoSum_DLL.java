public class twoSum_DLL {
    public static  class Node{
        int val;
        Node next;
        Node prev ;
        Node(int val){
            this.val = val;
        }
    }
       public static  void TwoSum(Node head , int target ){
        if(head == null || head.next==null){
            System.out.println("Enter Valid Linked List");
        }
        Node tail = head;
        while(tail.next != null){
            tail=tail.next;
        }
        while(head.val < tail.val){
            if(head.val + tail.val == target){
                System.out.println("On adding " +head.val+" & "+ tail.val+ " We got our target = "+ target);
                break ;
            }
            else if (head.val + tail.val < target) {
                head = head.next;
            }
            else {
                tail = tail.prev ;
            }
        }
       }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(13);
        Node e = new Node(100);
        a.prev = null;// not necessary beacuse its by default null;
        a.next = b;

        b.prev = a;
        b.next = c;

        c.prev = b;
        c.next = d;

        d.prev = c;
        d.next = e;

        e.prev = d;
        e.next = null;

        TwoSum(a , 16);
    }
}
