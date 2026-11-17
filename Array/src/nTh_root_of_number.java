import java.util.*;

public class nTh_root_of_number {
    static int root(int n , int m ){
        int l=1;
        int h=m;
        while(l<=h){
            int mid = (l+h)/2;
            int result = 1;

            for(int i = 1 ; i<=n ; i++){
                result*=mid;
            }

            if(result == m)return mid;
            else if(result > m){
                h=mid-1;
            }
            else if(result < m){
                l=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result=root(n,m);
        if(result<0){
            System.out.println("can't be determined");
        }
        else{
            System.out.println(result);
        }
    }
}
