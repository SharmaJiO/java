import java.util.*;
public class Rearrange_array_elements_by_sign {
    //Brute force
 public static int[] Rearrange1(int arr[]){
     int n = arr.length;
     int a = n/2;
     ArrayList<Integer> pos = new ArrayList<>();
     ArrayList<Integer> neg = new ArrayList<>();

     for(int i = 0 ; i<n ; i++){
         if(arr[i]>0)pos.add(arr[i]);
         else neg.add(arr[i]);
     }
     for(int i = 0 ; i<a ; i++){
         arr[2*i]=pos.get(i);
         arr[2*i+1]=neg.get(i);
     }
return arr;
 }

 //optimal
    public static int[] Rearrange2(int arr[]){
     int pos=0;
     int neg=1;
     int ans[]=new int[arr.length];
     for(int i =  0 ; i<arr.length ; i++){
         if(arr[i]>0){
             ans[pos]=arr[i];
             pos=pos+2;
         }
         else{
             ans[neg]=arr[i];
             neg=neg+2;
         }
     }
     return ans;
    }
    public static void main(String[] args) {
    int arr[]={3,1,-2,-5,2,-4};
    int []rearranged = Rearrange2(arr);
    for (int num:rearranged){
        System.out.print(num+" ");
    }
    }
}
