
public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    public static int queens(boolean[][] board, int row) {
        // base condition
        if (row == board.length) {
            display(board);
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean [][] board, int row, int col){
        //for upward
        for(int i = 0; i< row; i++){
            if (board[i][col]) {
                return false;
            }
        } 

        //left diagonal

    int maxLeft = Math.min(row,col);
    for(int i = 1; i <= maxLeft; i++){
        if(board[row-i][col-i]){
            return false;
        }
    }

        //right diagonal

        int maxRight = Math.min(row,board.length - col - 1);
        for(int i = 1; i<= maxRight; i++){
            if(board[row- i][col+i]){
                return false; 
            }
        }

        return true;
    }

    public static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
            
        }
        System.out.println();
    }


//     public static void main(String[] args) {
//         int n = 4;
//         boolean[][] board = new boolean[n][n];
//         knights(board, 0, 0, n);
//     }

//     public static int knights(boolean[][] board, int row, int col, int target ){
//         //base condition
//         if(target == 0 ){
//             display(board);
//             return 1;
//         }

//         if(col == board.length){
//             knights(board, row + 1, 0, target);
//             return 1; 
//         }

//         if(row == board.length - 1 && col ==board.length){
//             return 0;
//         }

//         if(isSafe(board, row, col)){
//             board[row][col] = true;
//             knights(board, row, col + 1, target - 1);
//             board[row][col] = false;
//         }
//         knights(board, row, col + 1, target);
//         return 1; 
//     }

//     private static void display(boolean[][] board){
//         for(boolean[] row : board){
//             for (boolean element : row){
//                 if(element){
//                     System.out.print("K");
//                 }else{
//                     System.out.println("X");
//                 }
//             }
//         }
//     }

//     private static boolean isSafe(boolean [][] board, int row, int col){
//         //cond 1 row+2
//         if(isValid(board, row - 2, col - 1)){
//             if(board[row - 2][col - 1]){
//                 return false;
//             }
//         }
//         if(isValid(board, row-2, col + 1)){
//             if(board[row - 2][col + 1]){
//                 return false;
//             }
//         }
//         if(isValid(board, row - 1, col + 2)){
//             if(board[row-1][col+2]){
//                 return false;
//             }
//         }
//         if(isValid(board, row-1, col-2)){
//             if(board[row-1][col-2]){
//                 return false;
//             }
//         }

//         return true;
        
//     }

//     //check if inbound matrix
//     public static boolean isValid(boolean[][] board, int row, int col){
//         if(row >= 0 && row < board.length && col < board.length && col >= 0){
//             return true;
//         }
//         return false;
//     }

}
