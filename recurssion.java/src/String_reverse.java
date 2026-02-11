import java.util.*;
public class String_reverse {
    public static void reverse(int n ,String str1 , StringBuilder str2){
        if(n<0){
            System.out.println(str2);
            return;
        }
        str2.append(str1.charAt(n));


        reverse(n-1 , str1 ,str2 );
    }
    public static void main(String[]args)
    {
        String str = "Sumit";
        int n = str.length();
        reverse(n-1,str , new StringBuilder(""));

    }
}
