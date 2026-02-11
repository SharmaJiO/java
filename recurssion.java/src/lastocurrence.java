import java.util.*;
public class lastocurrence {
    public static int check(int arr[] , int key , int i )
    {
        if(i == arr.length){
             return -1;
        }

        int isFound = check(arr, key, i + 1);

        // If found later, return it
        if (isFound != -1) {
            return isFound;
        }

        // Else check current index
        if (arr[i] == key) {
            return i;
        }
return isFound;

    }



    public static void main(String [] args){
        int arr[]={2,6,6,1};
        int b = check(arr , 6, 0);
        if(b == -1) System.out.println("Not present");
        else System.out.println("present at position "+b);
    }
}
