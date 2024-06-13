import java.util.Arrays;

public class path_with_direction {

    static void address(String s , boolean maze[][] , int r , int c ,int [][] path ,int step ){
        if (r==maze.length - 1 && c==maze[0].length - 1) {
            
            path[r][c] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(s);
            System.out.println();
            return ;
        }

        if (maze[r][c] == false) {
            return;
        }

        
        maze[r][c] = false;
        path[r][c] = step;
        if (r<maze.length - 1 ) {
            address(s+"D", maze, r+1, c, path, step+1);
        }

        if (c<maze[0].length - 1) {
            address(s+"R", maze, r, c+1, path, step+1);
        }

        if (r>0) {
            address(s+"U", maze, r-1, c, path, step+1);
        }

        if (c>0) {
            address(s+"L", maze, r, c-1, path, step+1);
        }

        maze[r][c] = true;
        path[r][c] = 0;



    }
    
    public static void main(String[] args) {
        boolean maze[][] = {
            {true,true,false},
            {true,true,true},
            {false,true,true}
        };
        int path[][] = new int[maze.length ][maze[0].length ];   
        address("",maze,0,0,path,1);
    }
}
