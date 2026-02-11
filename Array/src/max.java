import java.util.Scanner;

public class max {
    static int findmax(int arr[])
    {
        int mx = Integer.MIN_VALUE; // -infinity
        for(int i=0 ; i<arr.length ;i++)
        {
            if(arr[i]> mx){
                mx = arr[i];
            }
        }
       return mx ;
    }
    static int findSecondMax (int arr[]){
        int mx= findmax(arr);
        for(int j=0 ; j<arr.length;j++){  //This loop also goes through every element of the array.
            if(arr[j]== mx){
                arr[j]=Integer.MIN_VALUE;
                // If the current element equals the largest value (mx), it temporarily replaces it with the smallest possible value (Integer.MIN_VALUE).
            }
        }
        // This ensures that the largest value is ignored when searching for the second-largest value.
        int secondMax = findmax(arr);
        return secondMax;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array");
        int s = sc.nextInt();
        int arr[]= new int[s];
        System.out.println("Enter the elements in array");
        for(int i=0 ; i< arr.length ; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Second max is "+findSecondMax (arr) );
    }
}
