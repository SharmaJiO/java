import java.sql.SQLOutput;
import java.util.Scanner;

public class matrix_Add {
    static void printMatrix(int arr[][], int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
    static void add(int a[][] , int r1 , int c1 , int b[][] , int r2 , int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("wrong dimension entered ");
            return ;
        }
        int sum[][] = new int[r1][c1];
        for (int i = 1; i <= r1; i++) {
            for (int j = 1; j <= c1; j++) {
                sum[i][j] = a[i][j]+b[i][j];
            }
        }
printMatrix(sum , r1  , c1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array 1");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter the size of array 2");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr1[][] = new int[r][c];
        int arr2[][] = new int[m][n];  // Increase size by 1 to use 1-based indexing
        // Increase size by 1 to use 1-based indexing
        System.out.println("Enter the elements of array 1");
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println(" array 1 is:");
        printMatrix(arr1 , r , c);

        System.out.println("Enter the elements of array 1");
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                arr1[m][n] = sc.nextInt();
            }
        }

        System.out.println(" array 2 is:");
        printMatrix(arr2 , m , n);
        add(arr1 , r ,c ,  arr2 , m , n);
    }
}
