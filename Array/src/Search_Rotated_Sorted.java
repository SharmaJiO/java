//lC - 33- all distinct number in array
import java.util.*;
public class Search_Rotated_Sorted {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {  // Start from 1 to ignore the 0th element
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println();
    }
     static int check(int arr[] , int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target) { return mid;}
            if(arr[low]<arr[mid]){
                if(arr[low]<=target && arr[mid]>target){
                    high = mid -1;
                }
                else
                {
                    low = mid+1;
                }
            }
            else {
                if(arr[mid]>target && arr[high]<=target){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }

        }
return -1 ;
     }

    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target");
        int b = sc.nextInt();
        System.out.println("The array is");
        printArray(arr);
        int a = check(arr , b);
        if(a<0){
            System.out.println("target is not present");
        }
        else{
            System.out.println("Present at position  "+a);
        }


    }
}
