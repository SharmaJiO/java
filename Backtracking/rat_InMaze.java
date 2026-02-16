import java.util.*;
public class rat_InMaze {
    public static int rat(int maze[][], int row, int col, int n) {

        // boundary + blocked cell check
        if (row < 0 || col < 0 || row >= n || col >= n || maze[row][col] == 0)
            return 0;

        // destination reached
        if (row == n - 1 && col == n - 1)
            return 1;

        // mark visited
        maze[row][col] = 0;

        int up = rat(maze, row - 1, col, n);
        int down = rat(maze, row + 1, col, n);
        int left = rat(maze, row, col - 1, n);
        int right = rat(maze, row, col + 1, n);

        // unmark (backtrack)
        maze[row][col] = 1;

        return up + down + left + right;
    }
public static void print(int maze[][],int n){
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
}
    public static void main(String[] args) {

        int[][] maze = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        int n = maze.length;
print(maze , n);
        System.out.println("total valid paths are "+rat(maze, 0, 0, n));
    }
}
