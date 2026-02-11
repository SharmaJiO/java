import java.util.*;
public class gcd_euclids_recurs {
    static int  gcd( int x , int y){
       if(y==0) { return x ; }
       return gcd( y,x%y);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the  1 number ");
        int p = sc.nextInt();
        System.out.println("Enter the  2 number");
        int q = sc.nextInt();
        System.out.println(gcd(p,q));
    }
}
