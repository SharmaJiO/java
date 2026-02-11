import java.util.*;
public class tiling {
    public static int tilingproblem(int n){
        //base case
        if(n==0) return 1;
        if(n==1)return 1;

        //kaam
        //verical choice
        int fnm1=tilingproblem(n-1);

        //horizontal choice
        int fnm2=tilingproblem(n-2);

        int totalways = fnm1+fnm2;
        return totalways;
    }
    public static void main(String args[]){
        System.out.println(tilingproblem(2));

    }

}
