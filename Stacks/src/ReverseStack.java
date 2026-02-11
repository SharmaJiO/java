import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void  InsertAtBottom(Stack <Integer> st , int val){
        if(st.size()==0) {
            st.push(val);
return ;}
int top = st.pop();
        InsertAtBottom(st,val);
        st.push(top);
    }
    public static void RevStackRec(Stack <Integer> st){
        if(st.size()==1) return ;
        int top=st.pop();
        RevStackRec(st);
        InsertAtBottom(st,top);

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
           RevStackRec(st);
        System.out.println("Reversed stack"+st);
    }
}
