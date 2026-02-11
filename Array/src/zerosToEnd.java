// Program to move all zeros to end
import java.util.*;
public class zerosToEnd {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print( " "+arr[i]+" ");
        }
        System.out.println();

    }
    static void moveZeroes(int[] nums) {
        int j = -1;

        // Find the first zero
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zero is found, no need to move anything
        if (j == -1) return;

        // Move non-zero elements forward
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Size of array");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        moveZeroes(arr);
        printArray(arr);
    }
}
