import java.util.*;
public class lexicographical_order {
    static void lexi(String  []a){
        int n = a.length;
        for(int i=0 ; i< n-1 ; i++){
            int min = i;
            for( int j=i+1 ; j<n-1 ; j++ ){
                if(a[j].compareTo(a[min])< 0){
                    min = j;
                }
            }
              String temp = a[i];
            a[i]= a[min];
            a[min]=temp ;
        }
    }
    public static void main(String[]args){
        String [] fruits = {"kiwi" , " apple" , "papaya", "mango"};
        lexi(fruits);
        for(String i : fruits){
            System.out.print(i+" ");
        }
    }
}
