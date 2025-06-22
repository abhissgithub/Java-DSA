package BACKTRACKING;

public class NQUEENS {
    static int totalNQueens(boolean[][] board, int row) {

        if (row == board.length) {
            //  We Display The Queen On Board
            dispay(board);
            System.out.println();
            return 1;
        }
        int count = 0;
//        Now We Have To Placing the queen and check every row and col.
        for (int col = 0; col < board.length; col++) {
//            Now we check if Queen is safe or not
            if (issafe(board, row, col)) {
                board[row][col] = true;
                count = count+ totalNQueens(board, row + 1);
                board[row][col] = false;
            }

        }

        return count;
    }

    static void dispay(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();

        }

    }

    static boolean issafe(boolean[][] board, int row, int col) {
//        For Vertical search
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
//            For Left Diagonal
        int Maxleft = Math.min(row, col);
        for (int i = 1; i <= Maxleft; i++) {
            if (board[row - i][col - i]) {
                return false;

            }
        }
//        Right Diagonal
        int MaxRight = Math.min(row, board.length-col-1);
        for (int i = 1; i <= MaxRight; i++) {
            if (board[row - i][col + i]) {
                return false;


            }

        }
        return true;

    }

    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        System.out.println("Total Number Of Ways: "+totalNQueens(board,0));
    }
}
