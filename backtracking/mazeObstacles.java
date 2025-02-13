
import java.util.ArrayList;



public class mazeObstacles {
    public static void main(String[] args) {
        boolean[][] board = {
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        System.out.println(obstaclesRet("", board, 0, 0));
    }

    public static void obstacles(String p ,boolean[][] maze,  int r, int c){
        if(r == maze.length -1  && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
         
        if(r< maze.length -1){
            obstacles(p + "D", maze, r+1, c);
        }
        if(c< maze[0].length -1){
            obstacles(p + "R", maze, r, c + 1);
        }
    }
   
    public static ArrayList<String> obstaclesRet(String p, boolean[][] maze , int r , int c){
        if(r == maze.length -1 && c == maze[0].length -1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(!maze[r][c]){
            return list;
        }

        if(r < maze.length -1){
            list.addAll(obstaclesRet(p + "D", maze, r + 1, c));
        }
        if(c < maze[0].length -1){
            list.addAll(obstaclesRet(p + "R", maze, r , c+ 1));
        }
        return list;
    }


}
