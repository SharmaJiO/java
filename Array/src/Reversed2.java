import java.util.Scanner;

public class Reversed2 {
    static void swap(int arr[] , int i , int j)
    {
 int temp = arr[i];
 arr[i]=arr[j];
 arr[j]=temp;
    }
    static void Reverse(int arr[]) {
        int i=0  ,j= arr.length-1;
        while(i<j){
            swap(arr , i , j);
            i++;
            j--;
        }
    }
    static void print(int arr[]) {
        System.out.print("Reversed array is " );
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the elements in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Reverse(arr);
        print(arr);
        }
    }


