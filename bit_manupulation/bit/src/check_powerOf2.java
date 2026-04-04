import java.util.*;
public class check_powerOf2 {
    public static boolean check(int x){
        if( (x&(x-1)) == 0)return true;
        else return false;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();
         if(check(n)){
             System.out.println("power of 2");
         }
         else {
             System.out.println("Not a power of 2");
         }

    }

}
