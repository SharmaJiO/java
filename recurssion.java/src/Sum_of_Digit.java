import java.util.*;
public class Sum_of_Digit  {
    static int Digit(int n){
        if(n>0 && n<=9) return n;
        else
        return Digit(n/10)+ n%10;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the digit ");
        int n = sc.nextInt();
        int sum = Digit(n);
        System.out.println("Sum of the digits is " +sum);
    }
}
