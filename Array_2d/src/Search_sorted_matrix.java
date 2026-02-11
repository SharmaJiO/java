import java.util.Scanner;

public class Search_sorted_matrix {

    static void printMatrix(int arr[][], int r) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static boolean stairCaseSearch(int arr[][],int r ,  int key){
        int row = 0 , col = r-1;
        while(row<r && col>=0){
            if(arr[row][col]==key){
                System.out.println("Element found at"+row+","+col);
                return true;
            }
            else if(key > arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key nor found");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int r = sc.nextInt();
        int arr1[][] = new int[r][r];

        System.out.println("Enter the elements of array 1");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the key ");
        int key = sc.nextInt();
        if(!stairCaseSearch(arr1 , r , key)){

        }


    }
}
