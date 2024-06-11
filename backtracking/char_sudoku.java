public class char_sudoku {

    static boolean solve(char [][] board){
        for(int i=0 ; i<=8 ; i++){
            for(int j= 0 ; j<=8 ; j++){
                if(board[i][j] == '.'){
                    for(char digit='1' ; digit<='9' ; digit++){
                        if(isValid(board,digit , i , j)){
                            board[i][j] = digit ;

                            if (solve(board)) {
                                return true;
                            }
                            else{
                                // Backtracking
                                board[i][j] = '.' ;
                            }
                        }
                        
                    }
                    return false ;
                }
            }
        }
        return true ;
    }

    static boolean isValid(char [][]board , char digit , int row , int col){
        // Check the row
        for(int i=0 ; i<9 ; i++){
            if(board[row][i] == digit){
                return false ;
            }
            // check the col
            if(board[i][col] == digit){
                return false ;
            }
        }

        // Now check the sub-box of size : 3x3.
        int startRow = row - row % 3 ;
        int startCol = col - col % 3 ;
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                if (board[startRow+i][startCol+j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    static void display(char [][] board){
        if (solve(board)) {
            System.out.println("Solution Found : ");
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("No solution exists");
        }
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}

        };
        display(board);
        
    }
    
}
