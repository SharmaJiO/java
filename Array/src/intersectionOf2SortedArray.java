import java.util.*;
public class intersectionOf2SortedArray {
static ArrayList<Integer> FindIntersection(int arr1[] , int arr2[] , int m , int n){

    ArrayList<Integer> l1= new ArrayList<>();
    int i =0 ; int j =0 ;
    while(i<m && j<n)
    {
        if(arr1[i]<arr2[j]){
            i++;
        } else if (arr2[j] < arr1[i]) {
            j++;
        }else{
            l1.add(arr1[i]);
            i++;
            j++;
        }
    }
    return l1;
}
    public static void main(String[]args){
        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4,4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4,4, 5, 11, 12};
        ArrayList<Integer> Intersection = FindIntersection(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Intersection )
            System.out.print(val+" ");
    }
}
