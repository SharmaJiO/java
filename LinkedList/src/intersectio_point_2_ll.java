import java.util.*;
public class intersectio_point_2_ll {
    public static  class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
        public static class linklist{

            //Short way to find intersection
            Node intersection2(Node headA , Node headB){
                Node tempA = headA;
                Node tempB = headB;
                while(tempA!=tempB){
                    tempA=(tempA==null)?headB:tempA.next;
                    tempB=(tempB==null)?headA:tempB.next;
                }
                return tempA;
            }

            //Little longer way to find intersection

            Node intersection1(Node headA , Node headB ){
                Node tempA = headA;
                Node tempB = headB;

                //find the length of A-ll
                int lenA = 0;
                while(tempA!=null){
                    lenA++;
                    tempA = tempA.next;
                }

                //find the length of B-ll
                int lenB = 0;
                while(tempB!=null){
                    lenB++;
                    tempB = tempB.next;
                }

                tempA= headA;
                tempB = headB;

                if(lenA >lenB){
                    int size = lenA-lenB;
                    for(int i = 1; i<=size ; i++){
                        tempA = tempA.next;
                    }
                }

                if(lenB >lenA){
                    int size = lenB-lenA;
                    for(int i = 1; i<=size ; i++){
                        tempB = tempB.next;
                    }
                }

                while(tempA!=tempB){
                    tempA=tempA.next;
                    tempB=tempB.next;
                }
                return tempA;
            }

        }

        public static void main(String[] args) {
            // Common part
            Node c1 = new Node(7);
            Node c2 = new Node(8);
            Node c3 = new Node(9);

            c1.next = c2;
            c2.next = c3;

            // List A
            Node a1 = new Node(1);
            Node a2 = new Node(2);
            Node a3 = new Node(3);

            a1.next = a2;
            a2.next = a3;
            a3.next = c1;   // attach common part

            // List B
            Node b1 = new Node(4);
            Node b2 = new Node(5);

            b1.next = b2;
            b2.next = c1;   // attach same common node

            linklist ll = new linklist();
            Node temp = ll.intersection2(a1 , b1);
            System.out.println("intersection is at node "+temp.val);

        }
    }
}
