import java.util.*;
public class bit_set_notSet {
public static boolean check(int a , int b){
    if((a&(1<<b))!=0)return true;
    else return false;
}

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("Enter the set position you want to check");
        int b = sc.nextInt();
        if(!check(a,b)) System.out.println("not set");
        else System.out.println("set");

    }
}
// tc = O(1)
//computer performs bitwise operationsmuch much faster