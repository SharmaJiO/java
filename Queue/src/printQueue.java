import java.util.*;
public class printQueue {
    public static void main(String[]args){
        Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        int a = q.size();
        for(int i = 0 ; i<a ; i++){
            System.out.println("The "+ (i+1) +" element of queue is = "+q.peek());
            q2.add(q.remove());
        }
        while(q2.size()>0){
            q.add(q2.remove());
        }
        System.out.println(q);
    }
}
