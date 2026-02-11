import java .util.*;
public class Zero_to_end {
    static void End( int[]a){
        int n = a.length;
        for(int i = 0 ; i <n-1 ; i++)
        {
            boolean swapped = false;
            for(int j = 0; j<n-i-1 ; j++){
                if( a[j]==0 && a[j+1]!=0){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break ;
            }
        }
    }
    public static void main(String[] args){
//        int a[]= {0,5,0,3,42};
        int a[]= {5,2,4,0,0};
        End(a);
        for(int i = 0 ; i<a.length ; i++ ){
            System.out.print(" " +a[i]+" ");;
        }
    }
}
