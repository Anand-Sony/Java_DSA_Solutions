public class sudoku {
    static boolean solve(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    for (int digit = 1; digit <= 9; digit++) {
                        if (isValid(board, digit, i, j)) {
                            board[i][j] = digit;
                            if (solve(board)) {
                                return true;
                            } else {
                                board[i][j] = 0;
                            }
                        }
                    }
                    // in this loop no case is valid so we will return false.
                    return false;
                }
            }
        }
        // in this loop : no empty space is there : means solved so we will return true.
        return true;
    }

    static boolean isValid(int[][] board, int digit, int r, int c) {
        for (int i = 0; i < 9; i++) {
            if (board[r][i] == digit) { //means that is placed already so return false.
                return false;  
            }
            if (board[i][c] == digit) { //means that is placed already so return false.
                return false;  
            }
        }
        // now condition for each 3x3 matrix.
        int startRow = r - r % 3;  // this initialize the value of starting postion of each block.
        int startCol = c - c % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + startRow][j + startCol] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printSolution(int[][] board) {
        if (board == null) {
            System.out.println("No solution found.");
            return;
        }
        System.out.println("Solution found:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = {
            {0, 0, 0,  2, 0, 5, 0, 0, 0},
            {0, 8, 0, 0, 0, 0, 0, 7, 0},
            {0, 0, 3, 0, 0, 0, 5, 0, 1},
            {0, 0, 0, 0, 0, 3, 0, 2, 0},
            {0, 0, 0, 0, 5, 0, 0, 0, 0},
            {0, 5, 0, 4, 0, 0, 0, 0, 0},
            {1, 0, 7, 0, 0, 0, 8, 0, 0},
            {0, 9, 0, 0, 0, 0, 0, 6, 0},
            {0, 0, 0, 5, 0, 0, 0, 0, 0}
        };

        if (solve(board)) {
            printSolution(board);
        }
    }
}