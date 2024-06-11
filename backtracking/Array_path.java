import java.util.ArrayList;

public class Array_path {

    static ArrayList<String> path(String s , int r , int c ){
        ArrayList<String> l = new ArrayList<>();

        if (r==1 && c==1) {
            l.add(s);
        }

        if (r>1) {
            ArrayList<String> left = path(s+"D",r-1,c);
            l.addAll(left);
        }

        if (c>1) {
            ArrayList<String> right = path(s+"R",r,c-1);
            l.addAll(right);
        }

        return l;
    }

    public static void main(String[] args) {
        System.out.println(path("", 3, 3));
        System.out.println(path("", 3, 4));
    }
    
}
