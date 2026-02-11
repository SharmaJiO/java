import java.util.Scanner;

public class spiral_matrix {
    static void printMatrix(int arr[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void spiral_matrix(int arr1[][] , int r , int c){
        int topRow =0 , bottomrow= r-1 , leftcolumn  = 0 , rightColumn = c-1;
        int total=0;
        while(total < r*c){

            // topRow -> leftCol to rightcol
            for(int i =leftcolumn ; i<=rightColumn && total < r*c ; i++ ){
                System.out.print(arr1[topRow][i]+" ");
                total++;
            }
            topRow++ ;

            // rightColumn-> topRow to bottomrow
            for(int i =topRow ; i<=bottomrow &&  total < r*c ; i++ ){
                System.out.print(arr1[i][rightColumn]+" ");
                total++;
            }
            rightColumn--;

            // bottomRow-> rightcolumn to leftColumn
            for(int i = rightColumn ; i>=leftcolumn &&  total < r*c ; i--){
                System.out.print(arr1[bottomrow][i]+" ");
                total++;
            }
            bottomrow--;

            // leftColumn = bottomRow to toprow
            for(int i =bottomrow ; i>=topRow && total < r*c ; i-- ){
                System.out.print(arr1[i][leftcolumn]+" ");
                total++;
            }
            leftcolumn++;
        }
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
        spiral_matrix(arr1, r ,c  );
    }
}
