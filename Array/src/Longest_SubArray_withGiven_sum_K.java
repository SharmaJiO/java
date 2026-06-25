import java.util.*;
public class Longest_SubArray_withGiven_sum_K {

    //better approach --> using hashmap
public static int Max_subArray(int []arr , int s){
    int len = Integer.MIN_VALUE , sum = 0 ;
    HashMap<Integer,Integer>map = new HashMap<>();
    for(int i = 0 ; i<arr.length ; i++){
        sum = sum+arr[i];

        if(sum == s){
            len = i+1;
        }
        if(map.containsKey(sum-s)){
            int a = i-map.get(sum-s);
            len=Math.max(len,a);
        }
        if(!map.containsKey(sum)){
            map.put(sum,i);
        }
    }
    return len;
}
public  static int Max_subArray2(int arr[],int s){
    int len=0;
    int sum=0;
    int i=0 ,j=0;
    while(j<arr.length){
        // Expand window
        sum += arr[j];

        // Shrink window if sum exceeds k
        while (sum > s) {
            sum -= arr[i];
            i++;
        }

        // Check if current window sum is k
        if (sum == s) {
            len = Math.max(len, j - i + 1);
        }

        j++;
    }
    if(len==0){return 0;}
return len;
}
    public static void main(String[] args) {
    int[]arr = {-3,2,1};
    int max = Max_subArray2(arr,6);
        System.out.println(max);
    }
}
