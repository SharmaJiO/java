import java.util.*;
public class multiples
{
    static void pro( int n , int k){
        if(k==0) return ;
else {
    pro(n , k-1);
            System.out.println( n*k );
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number ");
        int p = sc.nextInt();
        System.out.println("Enter the how many factors you want");
        int q = sc.nextInt();
         pro(p,q);
    }
}
