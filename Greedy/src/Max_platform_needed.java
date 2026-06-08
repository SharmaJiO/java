import java.util.*;

public class Max_platform_needed {

    public static int countPlatforms(int n , int[]arr,int[]dept){
        Arrays.sort(arr);
        Arrays.sort(dept);

        //Inatialixe the counters and pointers
        int platform = 1;
        int max = 1;
        int i = 1 , j=0;
        while(i<n && j<n){
            if(arr[i]<=dept[j]) {
                platform++;
                i++;
            }
            else{
                platform--;
                j++;
            }
            max=Math.max(max,platform);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {900, 945, 955, 1100, 1500, 1800};
        int[] dep = {920, 1200, 1130, 1150, 1900, 2000};
        int n = arr.length;
        int platform = countPlatforms(n,arr,dep);
        System.out.println("Min platform req is = "+platform);

    }
}
