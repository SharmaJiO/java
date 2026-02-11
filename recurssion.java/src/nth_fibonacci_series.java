import java.sql.SQLOutput;
import java.util.*;
public class nth_fibonacci_series {
    static int fibonnaci(int n){
        if(n==0 || n==1) return n ;

        return (fibonnaci(n-1)+fibonnaci(n-2));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thr nth fibonacci to be found");
        int n = sc.nextInt();
        for (int i =0 ; i<n ; i++) {
            System.out.println( fibonnaci(i));
        }
    }
}
