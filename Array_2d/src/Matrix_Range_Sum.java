import java.util.Scanner;

public class Matrix_Range_Sum {
    static void PrefixSum(int [][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i =0 ; i<r ; i++){
            for(int k=1 ; k<c ; k++){
                matrix[i][k]=matrix[i][k] + matrix[i][k-1];
            }
        }
    }
    // METHOD 1 OF FINDING SUM OF MATRIX OF GIVEN RANGE -------------------- USING BRUTE FORCE
    static int findSum1(int [][] matrix , int l1 , int l2 , int r1 , int r2){
        int sum = 0 ;
        for(int i = l1 ; i<=l2 ; i++){
           for(int j = r1 ; j<=r2 ; j++){
               sum+=matrix[i][j];
           }
        }
        return sum ;
    }
    // METHOD 2 OF FINDING SUM OF MATRIX OF GIVEN RANGE -------------------- USING PREFIX SUM OF ROW METHOD
    static int findSum(int [][] matrix , int l1 , int l2 , int r1 , int r2){
        int sum = 0 ;
        PrefixSum(matrix);
        for(int i = l1 ; i<=l2 ; i++)
            if(r1>=1)
            sum += matrix[i][r2]- matrix[i][r1-1];
            else
                sum += matrix[i][r2];
        return sum ;
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
        System.out.println("Enter the Range Matrix to be added");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("rectangle sum "+findSum1(  arr1 , l1 ,l2 ,r1 ,r2));
        System.out.println("rectangle sum "+findSum(  arr1 , l1 ,l2 ,r1 ,r2));
    }
}

