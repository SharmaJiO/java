import java.util.*;
public class deque {
    public static void main(String []args){
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq); // [1, 2, 3, 4]
        dq.addFirst(5);
        System.out.println(dq); // [5, 1, 2, 3, 4]
        dq.removeLast();
        System.out.println(dq); // [5, 1, 2, 3]
        dq.removeFirst();
        System.out.println(dq); // [1, 2, 3]
        System.out.println(dq.getFirst()); //  returns the element from first -- 1
        System.out.println(dq.getLast());  //  returns the element from last -- 3
    }
}
