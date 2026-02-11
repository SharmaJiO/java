import java.util.Scanner;
import java.util.Stack;

public class Remove {
    public static void removeFromBottom(Stack <Integer> st ){

        Stack<Integer> rt = new Stack<>();
        while(st.size()>1){
            rt.push(st.pop());
        }
        st.pop();
        while(rt.size()>0){
            st.push(rt.pop());
        }
    }
    public static void removeFromIndex(Stack <Integer> st , int idx){
        int x = st.size();
        Stack<Integer> rt = new Stack<>();
        while(st.size()-1 >idx){

            rt.push(st.pop());
        }
        st.pop();
        while(rt.size()>0){
            st.push(rt.pop());
        }

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        System.out.println("Orignal stack"+st);
//        removeFromBottom(st);
//        System.out.println("New stack"+st);

        System.out.println("Enter the index for number to be removed");
        int idx = sc.nextInt();
        removeFromIndex(st , idx);
        System.out.println("New stack"+st);
    }
}
