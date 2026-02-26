public class Implimentation {
   public static class Node{
       int data;
       Node next ;
       Node(int data)
       {
           this.data=data;
       }
   }
public static class linkedlist {
       Node head = null;
       Node tail = null;
       void insertAtEnd(int val){
           Node temp = new Node(val);
           if(head==null){
               head=temp;
               tail=temp;
           }
           else{
               tail.next=temp;

           }
           tail = temp;
       }
       void insertAtBeginning(int val){
           Node temp = new Node(val);
           if(head==null){
               head =tail  = temp;
           }
           else{
               temp.next=head;
               head=temp;
           }
       }
       void InsertAtIndex(int idx ,int val)
       {
           Node t = new Node(val);
           Node temp = head;
           if(idx == size()){
               insertAtEnd(val);
               return ;
           }
           if(idx == 0){
               insertAtBeginning(val);
               return ;
           }
           for(int i=1;i<= idx-1 ; i++){
               temp=temp.next;
           }
           t.next=temp.next;
           temp.next=t;
       }

       int getAt(int idx){
           Node temp=head;
           for(int i=1;i<=idx;i++){
               temp=temp.next;
           }
           return temp.data;
       }
       void deleteAt(int idx){
           if(idx==0){
               head = head.next;
               return ;
           }

           Node temp = head;
           for(int i=1;i<=idx-1 ; i++){
               temp = temp.next;
           }
           temp.next=temp.next.next;
           if(idx== size()-1){
          tail=temp;}
       }
       void display(){
           Node temp = head ;
           while(temp!=null){
               System.out.print(temp.data+" ");
               temp=temp.next;
           }
           System.out.println();
       }
       int size(){
           Node tem = head ;
           int count = 0 ;
           while(tem!=null){
               count++;
               tem=tem.next;
           }
           return count ;
       }
}
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtBeginning(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(7);
        ll.insertAtEnd(8);
        ll.display();
        ll.InsertAtIndex(2,88);
        ll.display();
        System.out.println("Size of linked list is "+ ll.size());
        System.out.println("Data at index 3 is " + ll.getAt(0));
        ll.deleteAt(2);
        ll.display();
    }
}
