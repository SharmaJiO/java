import java .util.*;
 public class Array_max_recurssion {
     static int  maxArray(int[ ]arr , int idx){
         if(idx == arr.length-1){
             return arr[idx];
         }
         int s = maxArray(arr , idx+1);
         return Math.max(arr[idx], s);
     }
     public static void main(String[] args){
         int arr []= {5,6,7,8};
         System.out.println(maxArray(arr , 0));
     }
}
