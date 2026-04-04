import java.util.*;
public class decimal_binary {
    public static String decimal(int x){
        if(x==0) return "0";
        StringBuilder sb = new StringBuilder();
        while(x>0){
            sb.append(x%2);
            x=x/2;
        }
        return sb.reverse().toString();

    }

    public static  void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        System.out.println("The decimal format is "+decimal(a));
    }
}
