import java.util.Scanner;

public class sort_0_1_Using2pointer {
 static void swap( int arr[] , int i , int j){
    int temp = arr[i];
    arr[i]= arr[j];
    arr[j] =  arr[i];
 }
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print( " "+arr[i]+" ");
        }
        System.out.println();

    }

    static void sortZerosAndOnes(int[] arr) {
        int n = arr.length;
         int left = 0 ;
         int right = n-1;
        while (left < right) {
            if (arr[left] == 1 && arr[right]==0){
                swap(arr , left , right);
                left ++;
                right -- ;
            }
            if(arr[left]==0){
                left ++;
            }
            if(arr[right]==1){
                right -- ;
            }
}
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s = sc.nextInt();
        int arr[] = new int [s];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Orignal array is ");
        printArray(arr);
        sortZerosAndOnes(arr);
        System.out.println("Sorted  array is ");
        printArray(arr);

    }
}

