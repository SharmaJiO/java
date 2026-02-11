import java.util.Scanner;

import java.util.*;
public class Add_Natural_no_alternate_sign {
    static int pro( int n){
       if(n==0) return 0;
       else if(n%2==0) return pro(n-1)-n;
       return pro(n-1)+n;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number ");
        int p = sc.nextInt();
        int sum = pro(p);
        System.out.println("Sum is " + sum);
    }
}
