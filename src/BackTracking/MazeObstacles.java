package BackTracking;

public class MazeObstacles {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, false},
                {true, true, true},
                {false, true, true}
        };
        obstacles("", board, 0, 0);
    }

    private static void obstacles(String p, boolean[][] board, int r, int c) {
        if (r == board.length - 1 && c == board[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(!board[r][c]){
            return;
        }
        if (r < board.length - 1) {
            obstacles(p + "D", board, r + 1, c);
        }
        if (c < board[0].length - 1) {
            obstacles(p + "R", board, r, c + 1);
        }
    }
}