import java.util.Scanner ;
public class uniqueNumber{
    static int Unique(int arr[])
    {
        int p=0;
        for(int i=0 ; i< arr.length ; i++)
        {
             int count =0 ;
            for(int j=i+1 ; j< arr.length ; j++){
                if(arr[i]==arr[j])
                {
                    count ++ ;
                }

            }
            if(count == 0)
            {
                p = arr[i];
                break ;
            }
        }
 return p;
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
        System.out.println(Unique(arr)+ " is the unique number");
    }
}

