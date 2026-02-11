//LC- 81 , this can also be code using hashmap but this is more optimal
import java.util.Scanner;

public class Search_Rotated_Sorted_2 {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {  // Start from 1 to ignore the 0th element
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println();
    }
    static boolean check(int arr[] , int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = (low+high)/2;

            // If mid element is the target
            if(arr[mid] == target) { return true;}

            // Handle duplicates: cannot determine sorted side
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }

            // Left half is sorted
            if(arr[low]<arr[mid]){
                if(arr[low]<=target && arr[mid]>target){
                    high = mid -1;
                }
                else
                {
                    low = mid+1;
                }
            }

            //// Right half is sorted
            else {
                if(arr[mid]>target && arr[high]<=target){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }

        }
        return false ;
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
        if(check(arr,b)){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }


    }
}
