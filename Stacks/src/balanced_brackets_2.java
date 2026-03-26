// This tells by removing how much bracket we can get valid string

import java.util.*;
public class balanced_brackets_2 {
public static int isBalanced(String str){
    Stack <Character> st = new Stack<>();
    Stack <Character> rt = new Stack<>();
    int n = str.length();
    for(int i  = 0 ; i<n; i++ ){
        char ch = str.charAt(i);
        if(ch == '('){
            st.push(ch);
        }
        else
        {
            if(st.size()==0){
                rt.push(ch);
            }
            else {
                st.pop();
            }
        }
    }

    return  rt.size();
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        int b = isBalanced(str);
        if(b!=0){
            System.out.println("We can make it balanced by removing "+b+" brackets");
        }
        else{
            System.out.println("Balanced String");
        }
    }
}
