import java.util.*;
public class Stock_span_problem {
   public static int[] stock(int []arr){
       Stack<Integer> st = new Stack<>();

       int n = arr.length;
       int []res = new int[n];
       res[0]=1;
       st.push(0);
       for(int i = 1 ; i<n ; i++){
           while(arr[st.peek()]<arr[i]){
               st.pop();
           }
           if(st.isEmpty())
           {res[i]=1;
           }
           else{
               res[i]=i-st.peek();
           }
           st.push(i);
       }
       return res;
   }
   public static void print(int[]res){
       for (int i = 0; i < res.length; i++) {
           System.out.print(res[i]+" ");
       }
       System.out.println();
   }
   public  static void main() {
         int arr[]={100,80,60,70,60,75,85};
       int res[]=  stock(arr);
       print(res);
    }
}
