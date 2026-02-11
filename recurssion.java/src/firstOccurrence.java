import java.util.*;
public class firstOccurrence {
    public static int check(int arr[] , int key , int i )
    {
        if(i == arr.length){
           return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return check(arr, key , i+1);
    }


    public static void main(String [] args){
        int arr[]={2,1,6,4};
        int b = check(arr , 5 , 0);
        if(b == -1) System.out.println("Not present");
        else System.out.println("present at position "+b);
    }
}
