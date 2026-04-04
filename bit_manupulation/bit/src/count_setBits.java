import java.util.*;
public class count_setBits {
   public static int count(int x){
       int c = 0 ;
       while(x>0){
           //Check LSB
           if((x&1) != 0){
               c++;
           }
           //right shift by 1
           x= x>>1;
       }
       return c;
   }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        // Take binary input as String
        String binary = sc.nextLine();
        //Convert binary string to decimal
        int a = Integer.parseInt(binary, 2);
        System.out.println("count of set bit is "+count(a));
    }
}
