public class nKnights {
    
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(knights(board, 0, 0, n));
    }

    public static int knights(boolean[][] board, int row, int col, int target ){
        //base condition
        if(target == 0 ){
            display(board);
            System.out.println();
            return 1;
        }

        if(col == board.length){
            knights(board, row + 1, 0, target);
            return 1; 
        }

        // if(row == board.length - 1 && col ==board.length){
        //     return 0;
        // }

        if (row == board.length) {
            return 0;
        }
        int count =0;

        if(isSafe(board, row, col)){
            board[row][col] = true;
            count += knights(board, row, col + 1, target - 1);
            board[row][col] = false;
        }
        count += knights(board, row, col + 1, target);
        return count; 
    }

    private static void display(boolean[][] board){
        for(boolean[] row : board){
            for (boolean element : row){
                if(element){
                    System.out.print("K");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }

    private static boolean isSafe(boolean [][] board, int row, int col){
        //cond 1 row+2
        if(isValid(board, row - 2, col - 1)){
            if(board[row - 2][col - 1]){
                return false;
            }
        }
        if(isValid(board, row-2, col + 1)){
            if(board[row - 2][col + 1]){
                return false;
            }
        }
        if(isValid(board, row - 1, col + 2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        if(isValid(board, row-1, col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }

        return true;
        
    }

    //check if inbound matrix
    public static boolean isValid(boolean[][] board, int row, int col){
        if(row >= 0 && row < board.length && col < board.length && col >= 0){
            return true;
        }
        return false;
    }
}
