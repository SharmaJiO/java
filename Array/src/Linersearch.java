import java.util.*;
public class Linersearch {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print( " "+arr[i]+" ");
        }
        System.out.println();

    }
    static void linearSearch(int[] arr , int a){
        boolean  found = false ;
        for(int i =0 ; i<arr.length ; i++){
            if(arr[i] == a){
                System.out.println("The number "+a+" is Present at Index "+i);
                found = true;
                break; // Exit loop after finding the element (optional)
            }
        }
        if (!found) {
            System.out.println("The number " + a + " is not present in the array.");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter the elements of Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        System.out.println("Enter the  number to be searched");
        int a = sc.nextInt();
        linearSearch(arr , a);
    }

}
