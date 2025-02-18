
import java.util.Arrays;



public class mazeMatrixPrint {
    public static void main(String[] args) {
        int[][] maze = new int[3][3];
        matrixSteps("", maze, 0, 0, 1);
    }

    public static void matrixSteps(String p, int[][] maze, int r, int c, int steps ){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            //need to add the ans to the maze
            maze[r][c] = steps;
            for(int[] arr : maze){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            maze[r][c] = 0;
            return ;
        }

        if(maze[r][c] != 0){
            return ;
        }

        // u d l r 
        maze[r][c] = steps;

        //up
        if(r > 0){
            matrixSteps( p + "U", maze, r - 1, c , steps + 1);
        }

        //down
        if(r < maze.length - 1){
            matrixSteps( p + "D", maze, r + 1, c , steps + 1);
        }

        //left
        if( c > 0){
            matrixSteps(p + "L", maze, r, c - 1, steps+ 1);
        }
        //right
        if( c < maze[0].length - 1){
            matrixSteps(p + "R", maze, r , c+ 1, steps+ 1);
        }

        maze[r][c] = 0;
    }
}
