import java.util.*;
public class LongestCommonprefix {
  public static String longest(String []s){
      String str="";
int n  = s.length;
String p=s[0];
for (int i =0 ; i<p.length() ; i++)
{
    boolean match = true;
    char ch = p.charAt(i);
    for(int j=1;j<n ;j++){
        if((i >= s[j].length() || s[j].charAt(i) != ch))
        {
            match= false;
            break;
        }

    }
    if(match==false) break;
    else str=str + ch;

}
return str;

  }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of  String array");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        String arr[]=new String[n];
        System.out.println("Enter the strings inside array");
        for(int i=0; i<n ; i++){
           arr[i]= sc.nextLine();
        }
        String newstr =longest(arr);
        System.out.println("Longest common prefix is = "+newstr);
    }
}
//p=length of  string of s[0] whose character is to be compared
// q=
//t.c=O(p*q);
//s.c=O(1)
