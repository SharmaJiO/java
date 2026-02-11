import java.util.Scanner;

public class RangeQuery {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {  // Start from 1 to ignore the 0th element
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println();
    }

    static int[] prefixSum(int arr[]) {
        int n = arr.length;
        int pref[] = new int[n];
        pref[0] = 0;  // Set the first element to 0 for easier calculations
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }
        return pref;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s = sc.nextInt();
        int arr[] = new int[s + 1];  // Increase size by 1 to use 1-based indexing
        System.out.println("Enter the elements of array");
        for (int i = 1; i <= s; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array is:");
        printArray(arr);
        int pref[] = prefixSum(arr);
        System.out.println("Prefix sum array is:");
        printArray(pref);

        System.out.println("Enter number of queries:");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("Enter range:");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = pref[r] - pref[l - 1];
            System.out.println("Answer is " + ans);
        }
        sc.close();
    }
}
