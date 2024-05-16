package BackTracking;
// place N queens on NxN board in a way that no two queens kill each other

public class NQueens {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        System.out.println(queens(board,0));
    }

    static int queens(boolean[][] board, int row){
        // when row comes out of board, we print the answer and increase the count by 1
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        //now placing the queen in every cell and checking if it is safe to place it there or not
        for(int col=0;col < board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count += queens(board,row+1);

                // backtrack the changes after coming out of function call
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // checking vertically upwards
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }

        //checking diagonal left
        int maxLeft = Math.min(row,col);
        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        // checking diagonal right
        int maxRight = Math.min(row, board.length-col-1);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        // if no check failed then finally return true
        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] booleans : board) {
            for (boolean elements : booleans) {
                if (elements) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
