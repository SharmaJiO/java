import java.util.*;
public class next_greater_element {
  public static int[] find(int arr[]){
      Stack <Integer> st = new Stack<>();
      int res[]=new int[arr.length];
      st.push(arr[arr.length-1]);
      res[arr.length-1]=-1;
      for(int i = arr.length-2 ; i>=0 ; i--){
          while(  st.size()!=0 && st.peek()<=arr[i]   ){
              st.pop();
          }
          if(st.size()==0)res[i]=-1;
          else res[i]=st.peek();
          st.push(arr[i]);
      }
      return res;
  }
    public static void main(String[] args) {
        int arr[]={1,5,3,2,1,6,3,4};
        int res[]=find(arr);
        for(int i = 0 ; i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
