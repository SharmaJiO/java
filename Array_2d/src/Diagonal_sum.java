import java.util.*;
public class Diagonal_sum {
    static void printMatrix(int arr[][], int r) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void right_diagonal(int arr[][] , int r){
        int sum = 0;
        for(int i = 0 ; i<r ; i++){
            sum+=arr[i][r-1-i];
        }
        System.out.println("Sum of right Diagonal is = "+sum);
    }
    static void left_diagonal( int arr[][], int r  ){
        int sum=0;
        for(int i = 0 ; i<r ; i++){
            sum+=arr[i][i];
        }
        System.out.println("Sum of left Diagonal is = "+sum);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int r = sc.nextInt();

        int arr1[][] = new int[r][r];

        System.out.println("Enter the elements of array ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
left_diagonal(arr1 , r);
        right_diagonal(arr1 , r);
    }
}

