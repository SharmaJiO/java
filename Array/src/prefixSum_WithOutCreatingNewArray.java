import java.util.Scanner;

public class prefixSum_WithOutCreatingNewArray {
        static void printArray(int arr[]) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                System.out.print(" " + arr[i] + " ");
            }
            System.out.println();
        }
        static int[] prefixSum(int arr[]){
            int n = arr.length ;
            for(int i =1 ; i< n ; i++){
                arr[i]+=arr[i-1];
            }
            return arr ;
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
          int pref[] = prefixSum( arr);
            System.out.println("Prefix sum array  is ");
            printArray(arr);

        }
    }