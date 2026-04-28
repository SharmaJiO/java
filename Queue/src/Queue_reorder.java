import java.util.*;
public class Queue_reorder {
    public static class queue_reorder {
        public Queue<Integer> reorder(Queue<Integer> q) {
            Stack<Integer> st = new Stack<>();
            int n = q.size();
            for (int i = 0; i < n / 2; i++) {
                st.push(q.remove());
            }

            while (!st.isEmpty()) {
                q.add(st.pop());
            }
            for (int i = 0; i < n / 2; i++) {
                q.add(q.remove());
            }

            for (int i = 0; i < n / 2; i++) {
                st.push(q.remove());
            }

            while (!st.isEmpty() ) {
                q.add(st.pop());
                q.add(q.remove());
            }

            return q;

        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println("Original queue " + q);
        queue_reorder l = new queue_reorder();
        q = l.reorder(q);
        System.out.println("reordered queue" + q);
    }
}
