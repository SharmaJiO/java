import java.util.*;
public class Queue_Interface {
    static void LinkedList_example(){
        LinkedList<Integer> q =new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek());// 1
        System.out.println(q.poll()); // removes 1
        System.out.println(q.peek()); // 2
        System.out.println(q.isEmpty()); // false
        System.out.println(q.size());
        System.out.println(q);
    }
    static void priorityQueue_example(){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(1);
        System.out.println(pq.peek()); // 1 - the smallest element as the highest priority
        System.out.println(pq);
        System.out.println(pq.poll());//1
        System.out.println(pq);
        System.out.println(pq.peek());//5
        System.out.println(pq.poll());
        System.out.println(pq.isEmpty());
    }

    static void Deque_example(){
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1); //1
        dq.addFirst(2); // 2 1
        dq.addLast(3); // 2 1 3
        dq.addLast(4); // 2 1 3 4
        System.out.println(dq.element());// 1st element of queue -- 2
        System.out.println(dq.getFirst()); // 1st element of queue -- 2 , same as pollFirst();
        System.out.println(dq.getLast()); // last element of queue -- 4  , same as pollLast();
        System.out.println(dq.getClass());
    }

    public static void main(String[] args) {
         // LinkedList_example();
        // priorityQueue_example();
        Deque_example();
    }
}
