import java.util.ArrayList;

public class diagonal_path {

    static ArrayList<String> path3(String s , int r , int c){
        ArrayList <String> l = new ArrayList<>();

        if (r==1 && c==1) {
            l.add(s);
        }

        if (r>1) {
            l.addAll(path3(s + "V", r-1, c));
        }
        if (c>1) {
            l.addAll(path3(s + "H", r, c-1));
        }
        if (r>1 && c>1) {
            l.addAll(path3(s + "D", r-1, c-1));
        }

        return l;

    }

    public static void main(String[] args) {

        System.out.println(path3("", 3, 3));
    }
    
}
