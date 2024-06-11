public class maze_path {

    /*
           3  2  1
        3  #  _  _
        2  _  _  _
        1  _  _  #

     */
    static void path(String p , int r , int c){
        if(r == 1 && c == 1){  // in the path we have to reach at final position : So r=1 and c=1;
            System.out.println(p);
            return ;
        }

        if (r>1) {
            path(p + "D", r-1, c);
        }

        if (c>1) {
            path(p + "R", r, c-1);
        }
    }

    public static void main(String[] args) {
        
        path("", 3, 3);
        path("", 3, 4);

    }
    
}
