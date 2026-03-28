import java.util.*;
public class set_i_bit {

    public static int set(int x , int i){

         return x | (1 << i);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
  // Take binary input as String
        String binary = sc.nextLine();
        //Convert binary string to decimal
        int a = Integer.parseInt(binary, 2);

        System.out.println("Enter the bit to be set");
        int b = sc.nextInt();

      int c= set(a,b);
        System.out.println("input = "+binary);
        System.out.println("output = "+Integer.toBinaryString(c));

    }

}
