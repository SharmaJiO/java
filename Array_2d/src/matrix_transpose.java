import java.util.Scanner;

public class matrix_transpose {
    static void printMatrix(int arr[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
     static void transpose(int arr1[][] , int r ,  int c){
        int arr2[][] = new int[c][r];
         for (int i = 0; i < c; i++) {
             for (int j = 0; j < r; j++) {
                 arr2[i][j]=arr1[j][i];
             }
         }
printMatrix(arr2 , c , r);
     }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr1[][] = new int[r][c];

        System.out.println("Enter the elements of array 1");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Orignal matrix ");
        printMatrix(arr1, r,c);
        System.out.println("transpose matrix ");

transpose(arr1 , r , c);
    }
}
