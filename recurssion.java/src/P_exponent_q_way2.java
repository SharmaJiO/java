import java.util.*;
public class P_exponent_q_way2 {
    static int pro( int p , int q){
        if(q==0) return 1;
        int smallpow= pro(p,q/2);
         if (q%2==0){
             return smallpow*smallpow;
        }
          return p* smallpow*smallpow;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number ");
        int p = sc.nextInt();
        System.out.println("Enter the how many times you want to multiply the number");
        int q = sc.nextInt();
        int sum = pro(p,q);
        System.out.println("Sum of the digits is " +sum);
    }
}