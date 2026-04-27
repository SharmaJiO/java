import java.util.*;
public class Queue_Reverse {
    public static class queue_reverse{
        public Queue<Integer> reverseQueue(Queue<Integer> q){
            Stack<Integer> st = new Stack<>();
            //transfering the values of queue to stack
            while(!q.isEmpty()){
                st.push(q.remove());
            }
            //transfering the value of stack again in queue
            while(!st.isEmpty())
            {
                q.add(st.pop());
            }

            return q;
        }

        public void display(Queue<Integer> q){
            while(!q.isEmpty()){
                System.out.print(q.remove());
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("Original queue "+q);
        queue_reverse q1 = new queue_reverse();
        q=q1.reverseQueue(q);
        System.out.println("Reversed queue "+q);
    }
}
