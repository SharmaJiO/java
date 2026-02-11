import java.util.*;
public class print_number_of_seven {
    static void print(int arr[][] ){
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0 ; i<n ; i++){
            for(int j =0 ; j<m ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
    static int count_sevens(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int c = 0 ;
        for(int i = 0 ; i<n ; i++){
            for(int j =0 ; j<m ; j++) {
                if (arr[i][j] == 7) c++;
            }
        }
        return c ;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("Enter the elements of array");
        for(int i = 0 ; i<n ; i++){
            for(int j =0 ; j<m ; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int a = count_sevens(arr);
        System.out.println(a);
    }
}
