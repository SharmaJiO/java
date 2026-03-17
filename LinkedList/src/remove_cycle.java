import java.util.*;
public class remove_cycle {

public static class Node{
    Node next;
    int data;
    Node(int data){
        this.data = data;
    }
}

public static class LinkedList{

 void  removeCycle(Node head){
//detect cycle
     Node slow = head;
     Node fast = head;
     boolean cycle = false ; // 0 means does not exists
     while(fast!=null && fast.next.next!=null){
         slow = slow.next;
         fast = fast.next.next;
         if(slow == fast)
         {
             cycle  = true;
             break;
         }
     }
     if(!cycle) {
         return;
     }
     //Find meeting point
         slow = head;
         Node prev = null ;//last node
         while(slow!=fast){
             slow=slow.next;
             prev = fast;
             fast = fast.next;
         }
         // remove cycle ->last.next = null
         prev.next = null;

    }

void display(Node head){
     Node  temp = head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
    System.out.println();
}
}

    public static  void main(String[]args){
Node x = new Node(3);
        Node y = new Node(4);
        Node z = new Node(5);
        Node n = new Node(6);
        x.next = y;
        y.next = z;
        z.next = n;
        n.next = y;
        LinkedList ll = new LinkedList();

        ll.removeCycle(x);
        ll.display(x);
    }
}
