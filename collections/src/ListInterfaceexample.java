import java.util.*;

public class ListInterfaceexample {
    static void ArrayListExamples(){
        ArrayList<Integer> l = new ArrayList<>();

        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(" ---ARRAY LIST---");
        System.out.println(l); // 1 2 3
        l.get(1); //  l.get(index)
        System.out.println(l.get(1));
        l.set(1,5);
        System.out.println(l);
    }
    static void linkedListExamples(){
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(" ---LINKED LIST---");
        System.out.println(l); // 1 2 3
        l.get(1); //  l.get(index)
        System.out.println(l.get(1));
        l.set(1,5);
        System.out.println(l);
    }
    static void StackExamples(){
        Stack<String> st = new Stack<>();
        st.push("Sumit");
        st.push("Raju");
        st.push("Praveen");
        System.out.println(" ---STACK---");
        System.out.println(st); // 1 2 3
        System.out.println(st.peek());

    }
    public static void main(String[] args) {
        ArrayListExamples();
        linkedListExamples();
        StackExamples();
    }
}
