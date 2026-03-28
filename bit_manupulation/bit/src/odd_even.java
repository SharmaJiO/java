//if the last bit i.e LSB is 0 -> even
//if the last bit ie LSB is 1  -> odd

import java.util.Scanner;

public class odd_even {

    public static void oddEven(int n){
        if((n&1)==0) System.out.println("even");
        else System.out.println("odd");
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        // Take binary input as String
        String binary = sc.nextLine();
        //Convert binary string to decimal
        int a = Integer.parseInt(binary, 2);

         oddEven(a);
oddEven(11);
    }
}
