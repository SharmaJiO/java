import java.util.Scanner;

public class clear_i_bits {

    public static int convert(int x , int i){
        return x & (~0<<i);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        // Take binary input as String
        String binary = sc.nextLine();
        //Convert binary string to decimal
        int a = Integer.parseInt(binary, 2);

        System.out.println("Enter the bit ");
        int b = sc.nextInt();
 int c = convert(a,b);

        System.out.println("input = "+binary);
        System.out.println("output = "+Integer.toBinaryString(c));

    }
}
