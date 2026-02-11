import java.util.*;
public class Sub_Arrays {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print( " "+arr[i]+" ");
        }
        System.out.println();

    }

    // BRUTE FORCE APPROACH
    static void Sub_Array(int arr[]){
        int currSum = 0 ;
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0 ; i<n ; i++){

            for(int j = i ; j< n ; j++){
                currSum = 0 ;
                for(int k = i ; k<=j ; k++){
                    currSum = currSum+arr[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum ="+maxSum);
    }

// OPTIMAL APPROCACH
    static void Sub_Array_prefix_SumMtd(int arr[]){
        int currSum = 0 ;
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0 ; i<n ; i++){
            int sum = 0;
            for(int j = i ; j< n ; j++){
                sum = sum+arr[j];
                System.out.println(sum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum ="+maxSum);
    }


    static  int[] prefixSum (int arr[]){
        int n = arr.length;
        int prefix [] = new int[n];
        prefix[0]=arr[0];
        for(int i = 1  ; i<n; i++){
           prefix[i]=prefix[i-1]+arr[i];
        }
        printArray(prefix);
        return prefix;
    }

    static void SubArraySum_prefix(int arr[] , int s , int e)
    {
      int prefix [] = prefixSum(arr);
        int subSum;

        if (s == 0) {
            subSum = prefix[e];
        } else {
            subSum = prefix[e] - prefix[s - 1];
        }

        System.out.println("The sum of array for the given range is: " + subSum);
    }

    // OPTIMAL APPROACH - USING KADNANE'S ALGORITHM
    public static void kadanes(int arr[]){
        int max = Integer.MIN_VALUE;
        int sum = 0 ;
        int strt = -1;
        int strt_index = -1;
        int end_index = -1;
        for(int i = 0 ; i<arr.length ; i++){
            if(sum==0) strt = i;
            sum = sum+arr[i];
            if(sum>max){
                max=sum ;
                strt_index = strt ;
                end_index = i ;
            }

            if(sum < 0){
                sum = 0 ;
            }
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter the elements of Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

// Sub_Array(arr);
        System.out.println("Enter the range ");
        int s = sc.nextInt();
        int e = sc.nextInt();
        SubArraySum_prefix(arr , s, e);
    }
}
