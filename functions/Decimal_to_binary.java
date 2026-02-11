import java.util.*;
public class Decimal_to_binary {
    public static int binary(int num){
        int n = num;
        int p = 0 ;
        int bin = 0 ;
        while(n!=0){
            int a = n % 2;
            bin = bin + (a * (int)Math.pow(10,p));
            p++;
            n=n/2;
        }
        return bin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be converted into binary");
        int n = sc.nextInt();
int ans = binary(n);
        System.out.println(ans);
    }
}
