public class search_linkLinst {
    public static class Node{
        int data;
        Node next ;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static class  linklist{
        int  check(Node head , int data){
            Node temp = head;
            int pos = 0;
            while(temp!=null){
                pos++;
                if(temp.data == data)return pos;
                temp = temp.next;
            }
            return -1;
        }

    }

    public static void main(String[] args) {
        linklist ll = new linklist();
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node e = new Node(8);
        a.next = b;
        b.next = c;
        c.next=e;
        int pos = ll.check(a,9);
        if(pos>0){
            System.out.println("Entered element is found at position ="+pos);
        }
        else {
            System.out.println("The Searched element is not present ");
        }

    }
}
