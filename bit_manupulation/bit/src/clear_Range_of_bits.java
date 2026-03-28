import java.util.Scanner;

public class clear_Range_of_bits {

    public static int range(int x , int i , int j){
        int a= (~0 << (j+1));
        int b = (1<<i)-1;
        return x & (a | b);
    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        // Take binary input as String
        String binary = sc.nextLine();
        //Convert binary string to decimal
        int a = Integer.parseInt(binary, 2);

        System.out.println("Enter the range");
        int i = sc.nextInt();
        int j = sc.nextInt();
       int c = range(a, i, j);

        System.out.println("input = "+binary);
        System.out.println("output = "+Integer.toBinaryString(c));

    }
}
