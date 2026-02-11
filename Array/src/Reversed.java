import java.util.Scanner;

public class Reversed {
    static int[] Reverse(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[n - i - 1];
        }
        return ans;
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
        int ans[] = Reverse(arr);
        System.out.println("Reversed elements in array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print( ans[i]);
        }
        }
    }

