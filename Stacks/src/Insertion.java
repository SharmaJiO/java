import java.util.*;
public class Insertion {
    public static void InsertAtBottomRec(Stack<Integer> st , int n) {
        if (st.size() == 0) {
              st.push(n);

            return;
        }
        int top = st.pop();
        InsertAtBottomRec(st , n);
        st.push(top);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("Orignal stack"+st);
//        System.out.println("Enter the element you want to insert");
//        int n = sc.nextInt();



//         Inserting Number AT bottom( Normal mthd)
//        Stack<Integer> rt = new Stack<>();
//        while(st.size()>0){
//            rt.push(st.pop());
//        }
//        st.push(n);
//        while(rt.size()>0){
//            st.push(rt.pop());
//        }
//        System.out.println(st);



//        Inserting Number AT bottom( Recursive mthd)
        System.out.println("Enter the number you want to insert at bottom");
        int x = sc.nextInt();
        InsertAtBottomRec(st,x);
        System.out.println("Orignal stack"+st);


             // Insert At Index
//        System.out.println("Enter the position where you want to enter the element");
//        int idx = sc.nextInt();
//        Stack<Integer> rt = new Stack<>();
//        while(st.size()>idx){
//            rt.push(st.pop());
//        }
//        st.push(n);
//        while( rt.size()>0){
//            st.push(rt.pop());
//        }
//        System.out.println(st);
    }
}
