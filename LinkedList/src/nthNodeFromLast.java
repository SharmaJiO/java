// Return nth Node from last
// nth node from last = size- node idx no (to be deleted) - 1;
public class nthNodeFromLast {
    public static class Node{
        int data;
        Node next ;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size(Node head){
           Node tem = head ;
            int count = 0 ;
            while(tem!=null){
                count++;
                tem=tem.next;
            }
            return count ;
        }
        Node  FromLast(Node head ,int idx){
            Node temp = head;
            int b= size(temp)-idx+1;
            for(int i = 1 ; i<=b-1 ; i++) {
                temp = temp.next ;
            }
            return temp;
        }
    }
    public static void main(String args[]){
        Node x = new Node(100);
        Node y = new Node(13);
        Node b = new Node(4);
        Node f = new Node(5);
        Node g = new Node(12);
        Node h = new Node(10);
        x.next = y; // node x linked to y
        y.next = b;
        b.next = f;
        f.next = g;
        g.next = h;
        linkedlist nn = new linkedlist();
        Node q = nn.FromLast(x,3);
        System.out.println(" Value of node with index 3 from last is "+q.data);
    }
}
