import java.util.*;
public class B_search {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print( " "+arr[i]+" ");
        }
        System.out.println();

    }
 static int binarysearch(int arr[] , int key){
        int n = arr.length;
        int start = 0 ;
        int end = n-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid] == key){
                return mid ;
            }
            if(arr[mid] > key ){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
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
        System.out.println("The array is");
        printArray(arr);
        System.out.println("Enter the number to be searched ");
        int a = sc.nextInt();
        int key = binarysearch(arr , a);
        if(key != -1){
            System.out.println("The provided number is found at position "+key);
        }
        else{
            System.out.println("provided number is not present");
        }
    }
}
