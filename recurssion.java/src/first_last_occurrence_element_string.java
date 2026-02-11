import java.util.*;
public class first_last_occurrence_element_string {
    public static void check(String str ,char ele , int first , int last , int n){
        if(n<0){
            System.out.println("first occurrence at index"+first);
            System.out.println("last ocurrence at index"+last);
            return;
        }
        char currchar = str.charAt(n);
        if(ele == currchar ){
            if(last == -1)
            { last = n;
            }else{
                first=n;
            }
        }
        check(str,ele,first,last,n-1);
    }
    public static void main(String[]args){
        String str = "Sumiti";
        char ch = 'i';
check(str,ch , -1 , -1 ,str.length()-1 );
    }
}
