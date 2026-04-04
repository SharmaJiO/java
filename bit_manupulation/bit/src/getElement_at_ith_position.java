import java.util.*;
public class getElement_at_ith_position {
 public static int search(int x , int i){
     int num = x & (1<<i);
     if(num == 0)return 0;
     else return 1;
 }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        // Take binary input as String
        String binary = sc.nextLine();
        //Convert binary string to decimal
        int a = Integer.parseInt(binary, 2);

        System.out.println("enter the position");
        int i = sc.nextInt();

        System.out.println("The element at position "+i+" is "+search(a,i));
    }
}
