//import java.util.ArrayList;
//import java.util.Stack;
import java.util.*;
public class basicsofstacks {
    public static void main(String[] args) {
        // int arr[] = new int[5];
        // ArrayList<Integer> arr = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        //  inserting in stack
        st.push(1);
        st.push(23);
        st.push(33);
        st.push(54);
        st.push(99);
       // peek
        System.out.println(st.peek());
        System.out.println(st);
//        st.pop(); // upar wale element ko hatta dena
//        System.out.println(st);
        System.out.println("Size is = " + st.size());
    }
}
