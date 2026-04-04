import java.util.*;
public class swap_2_numbers {
    public static void swap(int a , int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a after swap = "+a);
        System.out.println("b after swap = "+b);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a initially  = "+a);
        System.out.println("b initially = "+b);
        swap(a,b);

    }
}
