import java.util.*;
public class Binomial {
    public static int  factorial(int a ){
        int f=1;
        for(int i =1 ; i<=a ; i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter n and r");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int b = n-r;
        int ans = factorial(n)/(factorial(r)*factorial(b));
        System.out.println("Final ans is "+ans);
    }
}
