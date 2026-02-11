import java.util.*;
public class frnds_pairing {
    public static int pairing(int n){
        //base case
        if(n==1 || n==2) return n;

        //kaam
        //single choice choice
        int fnm1=pairing(n-1);

        //horizontal choice
        int fnm2=pairing(n-2);
        int pairways = (n-1)*fnm2;

        int totalways = fnm1+pairways;
        return totalways;
    }
    public static void main(String args[]){
        System.out.println(pairing(3));

    }
}
