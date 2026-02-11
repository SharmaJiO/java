import java.util.Scanner;

public class TimesRotated {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {  // Start from 1 to ignore the 0th element
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println();
    }

    //Position of minimum number of array will be the times of rotation
    static int RotationTimes(int arr[]){
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[low]<=arr[mid]){
                if(arr[low]< min) min = low ;
                low = mid+1;
            }
            else{
                if(arr[mid]<min) min = mid;
                high = mid-1;
            }
        }
        return min;
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

        System.out.println("The given array is rotated "+RotationTimes(arr));

    }
}
