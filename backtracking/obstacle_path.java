import java.util.ArrayList;

public class obstacle_path {

    static void path4(String s ,boolean [][] maze ,  int r , int c){

        if (r==maze.length -1  && c==maze[0].length -1 ) {  // in java array indices start at 0.
            System.out.println(s);
            return;
        }

        if (maze[r][c]==false) {
            return ;
        }

        if (r<maze.length - 1) {
            path4(s+ "D", maze, r+1, c);
        }
        if (c<maze[0].length - 1) {
            path4(s+ "R", maze, r, c+1);
        }

    }

    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };

        path4("", maze, 0, 0);
    }
    
}
