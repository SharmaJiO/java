import java.util.*;
public class Liner_Search_index {
    static int search(int arr [], int n ,int tar ,  int idx){
        if(idx >= n ){
            return -1;
        }
        if(arr[idx]== tar ) return idx;
        return search(arr, n , tar , idx+1);
    }
    public static void main(String[]args){
        int arr []= {5,6 , 4,7,8};
        int target = 4;
        int n = arr.length;
        int b = search( arr , n,target , 0);
        if( b== -1)System.out.println("Not present");
        System.out.println("The target element " + target+" is present at position: "+b);
    }
}
