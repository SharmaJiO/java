import java.util.Scanner;
public class Frequency {
    static int[] frequencyArray(int arr[]) {
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
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
        int freq[] = frequencyArray(arr);
        System.out.println("Enter Number of queries:");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.println("Enter the number to be searched:");
            int n = sc.nextInt();
                if (freq[n] > 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            q--;
        }
    }
}
