import java.util.Scanner;
public class all_natural_number {
     static void printIncreasing(int n){
        if(n ==1){
            System.out.println(n);
            return;
        }
//         System.out.println(n);
        printIncreasing(n-1);
         System.out.println(n);
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        printIncreasing(n);
    }
}
