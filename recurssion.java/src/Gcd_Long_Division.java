import java.util.*;
public class Gcd_Long_Division {
    static int  pro( int n , int k){
        while(n%k!=0){
            int remainder = n%k;
            n = k;
            k = remainder ;
        }
        return k ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the  1 number ");
        int p = sc.nextInt();
        System.out.println("Enter the  2 number");
        int q = sc.nextInt();
        System.out.println(pro(p,q));
    }
}
