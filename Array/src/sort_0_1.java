import java.util.Scanner;

public class sort_0_1 {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print( " "+arr[i]+" ");
        }
        System.out.println();

    }

    static void sortZerosAndOnes(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i < count) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }

        }
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s = sc.nextInt();
        int arr[] = new int[s];
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

