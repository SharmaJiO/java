//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct

import java.util.*;
public class twice_Appears {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {  // Start from 1 to ignore the 0th element
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println();
    }

    //brute force method
    static boolean containsDuplicate_brute(int arr[]){
        int n = arr.length;
        int count = 0 ;
        for(int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){
                if(arr[i] == arr[j]) return true;
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
        System.out.println("The array is");
        printArray(arr);
//        System.out.println(containsDuplicate_brute(arr));

    }
}
