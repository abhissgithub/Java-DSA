package BACKTRACKING;

public class NQUEEN {
    static int queen(boolean[][] board, int row) {
        if (row == board.length) {
//            Here We The Display The Queen
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
//        Here We Put The Queen at the safe place
//        Initially we declares the col
        for (int col=0;col<board.length;col++){
//            Now We Check Place Is safe or not
            if (issafe(board,row,col)){
                board[row][col]=true;
                count+=queen(board,row+1);
                board[row][col]=false;
            }
        }

        return count;
    }
    static boolean issafe(boolean[][] board,int row,int col){
//        Now We Check Vertical
        for (int i=0;i<row;i++){
           if (board[i][col]){
               return false;
           }
        }
//        Now We Check At Left Diagonal
        int LeftMax=Math.min(row,col);
        for (int i=1;i<=LeftMax;i++){
            if (board[row-i][col-i]){
                return false;
            }
        }
//        Now We Check For The Right Digonal
        int RightMax=Math.min(row, board.length-col-1);
        for (int i=1;i<=RightMax;i++){
            if (board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else System.out.print("X ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int n=4;
        boolean[][]board= new boolean[n][n];
        System.out.println(queen(board,0));
    }
}
