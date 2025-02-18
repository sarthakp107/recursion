

public class NQueens {
    public static void main(String[] args) {
        
    }
    
    public static int queens(boolean[][] board, int row ){
        if(row == board.length){
            display(board);
            return 1;
        }

        int count = 0;
            
        for (int col = 0; col < board[0].length ; col++) {
            
            if(col == board.length - 1){
                queens(board, row + 1);
            }

            if(isSafe(board, row, col)){
                board[row][col] = true; 
            }
        }
        return count;
    }

    private static void display(boolean[][] board){
         for(boolean[] row : board ){
            for(boolean element : row){
                if(element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
         }
    }
     
}
