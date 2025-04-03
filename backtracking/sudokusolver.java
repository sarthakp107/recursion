//revisit this
public class sudokusolver {
    public static void main(String[] args) {
        int[][] board = new int[][] {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };

        
        if (solver(board)) {
            display(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    public static boolean solver(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        // khali khojna board ma cuz 0 is empty in this case
        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }

            if (emptyLeft == false) {
                break;
            }
        }

        if (emptyLeft == true) {
            return true;
        }

        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solver(board)) {
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    public static void display(int[][] board) {
        for (int[] row : board) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] board, int row, int col, int num) {

        // row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // col
        for (int[] nums : board) {
            if (nums[col] == num) {
                return false;
            }
        }

        // grid
        // start = row - (row % 3)
        // end = col - (col % 3)

        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - (row % 3);
        int colStart = col - (col % 3);

        for (int i = rowStart; i < rowStart + sqrt; i++) {
            for (int j = colStart; j < colStart + sqrt; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

}
