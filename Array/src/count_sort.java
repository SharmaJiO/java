
    import java.util.*;
    public class count_sort {


        static int Max(int arr[]) {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }

        static int[] prefixsum (int arr[]){
            for(int i =1 ; i<arr.length ; i++){
                arr[i]+=arr[i-1];
            }
            return arr;
        }

        static int[] Sorted(int arr[]) {
            int max = Max(arr);
            int count[] = new int[max+1];
            // Initialize count array
            for (int i = 0; i <= max; i++) {
                count[i] = 0;
            }
            // Count elements
            for (int i = 0; i < arr.length; i++) {
                count[arr[i]]++;
            }

            int newCount[]=prefixsum(count);

            int Output[]=new int[arr.length];
            for(int i = arr.length-1 ; i>=0 ;i--){
                int idx = newCount[arr[i]]-1;
                Output[idx]=arr[i];
                newCount[arr[i]]--;
            }
            return Output;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of Array");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements  of Array");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(" unsorted array");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+"");
            }
            int newArr[] = Sorted(arr);
            System.out.println("sorted array");
            for (int i = 0; i < n; i++) {
                System.out.print(newArr[i]+"");
            }
        }
    }


