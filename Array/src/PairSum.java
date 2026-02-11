import java.util.Scanner;
public class PairSum {
    static int pairsum(int arr[], int p )
    {
        int count =0;
        for(int i=0 ; i< arr.length ; i++)
        {
            for(int j=i ; j< arr.length ; j++){
                for(int k=j+1 ; k< arr.length ; k++)
                {
                    if(arr[i]+arr[j]+arr[k]==p)
                    {
                        count ++ ;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array");
        int s = sc.nextInt();
        System.out.println("Enter the no to find his pair");
        int p = sc.nextInt();
        int arr[]= new int[s];
        System.out.println("Enter the elements in array");
        for(int i=0 ; i< arr.length ; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(pairsum(arr , p));
    }
}
