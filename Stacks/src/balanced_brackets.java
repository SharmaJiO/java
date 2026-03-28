import java.util.*;
public class balanced_brackets {
    public static boolean  isBalanced(String str){
        Stack <Character> st = new Stack<>();
        int n = str.length();
        for(int i  = 0 ; i<n; i++ ){
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            }
            else
            {
                if(st.size()==0){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }

        return  st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(isBalanced(str));

    }
}
