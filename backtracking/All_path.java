public class All_path {

    static void allDirection(String s , boolean[][] maze , int r , int c){

        if (r==maze.length-1 && c==maze[0].length - 1) {
            System.out.println(s);
            return ;
        }


        if (maze[r][c] == false) {
            return;
        }

        maze[r][c]=false;
        if (r<maze.length-1) {
            allDirection(s + "D", maze, r+1, c);
        }
        if (c<maze[0].length - 1) {
            allDirection(s + "R", maze, r, c+1);
        }
        if (r>0) {
            allDirection(s + "U", maze, r-1, c);
        }
        if (c>0) {
            allDirection(s + "L", maze, r, c-1);
        }

        maze[r][c] = true;

    }

    public static void main(String[] args) {
        
        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        allDirection("", maze, 0, 0);

    }
    
}
