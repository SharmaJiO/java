import java.util.Scanner;

public class Number_print_spiral_matrix {
    static void printMatrix(int arr[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] spiral_matrix(int n){
        int arr1[][]= new int[n][n];
        int topRow =0 , bottomrow= n-1 , leftcolumn  = 0 , rightColumn = n-1;
        int current=1;
        while(current <=n*n){

            // topRow -> leftCol to rightcol
            for(int i =leftcolumn ; i<=rightColumn && current <=n*n ; i++ ){
                arr1[topRow][i] = current;
                current++;
            }
            topRow++ ;
            System.out.println();

            // rightColumn-> topRow to bottomrow
            for(int i =topRow ; i<=bottomrow && current <=n*n; i++ ){
                arr1[i][rightColumn]= current ;
                current++;
            }
            rightColumn--;
            System.out.println();

            // bottomRow-> rightcolumn to leftColumn
            for(int i = rightColumn ; i>=leftcolumn && current <=n*n ; i--){
                arr1[bottomrow][i]=current;
                current++;
            }
            bottomrow--;
            System.out.println();

            // leftColumn = bottomRow to toprow
            for(int i =bottomrow ; i>=topRow && current <=n*n ; i-- ){
                arr1[i][leftcolumn]=current;
                current++;
            }
            leftcolumn++;
            System.out.println();
        }
        return arr1 ;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive integer ");
        int r = sc.nextInt();
   int[][] matrix = spiral_matrix(r);
        printMatrix(matrix, r, r);
    }
}
