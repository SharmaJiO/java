import java.util.*;
public class Linear_Search {
     static boolean search(int arr [], int n ,int tar ,  int idx){
if(idx >= n ){
    return false;
}
if(arr[idx]== tar ) return true;
 return search(arr, n , tar , idx+1);
     }
     public static void main(String[]args){
         int arr []= {5,6 , 4,7,8};
         int target = 4;
         int n = arr.length;
         if(search( arr , n,target , 0))
         {
             System.out.println("yes");
         }else {
             System.out.println("no");
         }
     }
}
