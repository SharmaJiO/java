import java.util.*;
public class candy_1 {
    public static int candy(int[]ratings){
        int n = ratings.length;
        int[]candies = new int[n];

        //Every child gets atleast 1 candy
        Arrays.fill(candies,1);

        for(int i =1;i<n ; i++){
            if(ratings[i]>ratings[i-1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for(int i = n-2 ; i>=0 ; i--){
            if(ratings[i]>ratings[i+1]){
                candies[i]=Math.max(candies[i],candies[i+1]+1);
            }
        }

        int sum = 0;
        for(int candy:candies){
            sum+=candy;
        }
        return sum;
    }
    public static void main(String[] args) {
      int []arr = {1,2,2};
        System.out.println("min candy needed is "+candy(arr));
    }
}
