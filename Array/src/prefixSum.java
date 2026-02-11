import java.util.Scanner;
public class prefixSum {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println();
    }
static int[] prefixSum(int arr[]){
    int n = arr.length;
    int pref[]= new int[n];
    pref[0]=arr[0];
            for(int i =1 ; i< n ; i++){
                pref[i]=pref[i-1]+arr[i];
            }
            return pref ;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the elements of array");
        for(int i=0 ; i<s ; i++) {
            arr[i] = sc.nextInt();
        }
            System.out.println("Orignal array is ");
            printArray(arr);
            int pref[]=prefixSum(arr);
            System.out.println("Prefix sum array  is ");
            printArray(pref);

    }
}