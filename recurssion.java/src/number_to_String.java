import java.util.*;
public class number_to_String {
    public static void convert( int n , String str , String[] arr){
        //Base case
        if(n==0){
            System.out.println(str);
            return ;
        }


        //kaam
        int digit = n%10;
        String word  =arr[digit];
         str = word+" "+str;

         //Recursive call
        convert(n/10 , str , arr);


    }

    public static void main(String[]args){

        String[] arr ={"zero","one","two","three","four","five","six","seven","eight","nine","ten"} ;
int n = 1748;
if(n%10  == 0){
    System.out.println("wrong number entered");


}else{
    convert(n," ",arr);
}


    }
}
