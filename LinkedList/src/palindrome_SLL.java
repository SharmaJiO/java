import java.util.*;
public class palindrome_SLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    //using stack
        public static boolean check(Node head){
            Stack<Integer> stack = new Stack<>();
            Node temp = head;

            //push all items in stack
            while(temp!=null){
                stack.push(temp.data);
                temp=temp.next;
            }
            //comparing
            temp = head;
            while(temp!=null){
                if(temp.data != stack.pop()){
                    return false;
                }
                temp=temp.next;
            }
            return true;
        }

        //reversing the other half and comparing
        public static Node reverse(Node head){
            if(head == null || head.next == null)
                return head;

            Node newHead = reverse(head.next);
            head.next.next = head;
            head.next = null;

            return newHead;
        }

    public boolean isPalindrome(Node head) {

        if(head == null || head.next == null)
            return true;

        if(head.next.next == null)
            return head.data == head.next.data;

        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node newhead = reverse(slow.next);

        while(newhead != null){
            if(head.data != newhead.data)
                return false;

            head = head.next;
            newhead = newhead.next;
        }

        return true;
    }

        public static void display(Node head ){
         Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
            System.out.println();
        }

    public static void main(String[] args) {
        Node x = new Node(3);
        Node y = new Node(4);
        Node z = new Node(4);
        Node n = new Node(3);
        x.next = y;
        y.next = z;
        z.next = n;
        n.next = null;
        display(x);
        if(!check(x)) {
            System.out.println(" The List is not palindrome");
        }
        else{
            System.out.println("The list is not Palindrome");
        }
    }


}
