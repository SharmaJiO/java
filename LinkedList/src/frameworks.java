import java.util.LinkedList;
public class frameworks {
    public static void main(String []args){
        //create-only store objects
        LinkedList<Integer>ll = new LinkedList<>();

        //adding in linked List
        ll.addFirst(0);
        ll.addLast(1);
        ll.addLast(2);
        System.out.println(ll);

        //remove in linked List
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

    }
}
