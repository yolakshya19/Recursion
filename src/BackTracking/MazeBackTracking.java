package BackTracking;
//all four directions(U,R,D,L) are allowed to move if available

import java.util.Arrays;

public class MazeBackTracking {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        obstaclesBack("", board, 0, 0);
        int[][] path = new int[board.length][board[0].length];
        backtrackPrint("",board,0,0,1,path);
    }

    private static void obstaclesBack(String p, boolean[][] board, int r, int c) {
        if (r == board.length - 1 && c == board[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(!board[r][c]){
            return;
        }
        board[r][c] = false;
        if (r < board.length - 1) {
            obstaclesBack(p + "D", board, r + 1, c);
        }
        if (c < board[0].length - 1) {
            obstaclesBack(p + "R", board, r, c + 1);
        }
        if(r>0){
            obstaclesBack(p + "U",board,r-1,c);
        }
        if(c>0){
            obstaclesBack(p + "L",board,r,c-1);
        }
        board[r][c] = true;
    }

    private static void backtrackPrint(String p, boolean[][] board, int r, int c, int steps, int[][] path) {
        if (r == board.length - 1 && c == board[0].length - 1) {
            path[r][c]=steps;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!board[r][c]){
            return;
        }
        board[r][c] = false;
        path[r][c] = steps;
        if (r < board.length - 1) {
            backtrackPrint(p + "D", board, r + 1, c, steps + 1,path);
        }
        if (c < board[0].length - 1) {
            backtrackPrint(p + "R", board, r, c + 1,steps + 1,path);
        }
        if(r>0){
            backtrackPrint(p + "U",board,r-1,c,steps + 1,path);
        }
        if(c>0){
            backtrackPrint(p + "L",board,r,c-1,steps + 1,path);
        }
        board[r][c] = true;
        path[r][c] = 0;
    }
}
