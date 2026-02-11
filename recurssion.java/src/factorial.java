import java.util.*;
public class factorial  {
    static int factorial(int n){
//        base case
        if(n==0) return 1;


        return (n * factorial(n-1));
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n ;
        System.out.println("Enter the number whose factorial is to be found");
        n = sc.nextInt();
        factorial ob =  new factorial();
         int h = ob.factorial(n);
         System.out.println("Factorial is "+h);
    }
}
