import java.util.*;
public class binary_decimal {
    public static int binary(String st){
        int n = st.length();
        int p2=1 , num=0;
        for(int i = n-1 ; i>=0 ; i--){
            if(st.charAt(i)=='1'){
                num+=p2;
            }
            p2=p2*2;
        }
return num;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary string");
        String st = sc.nextLine();
        System.out.println("Decimal form is "+binary(st));
    }
}
