import java.util.ArrayList;

public class factors {

    static void factor(int n){
        ArrayList<Integer> l1 = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            if (n%i == 0) {
                l1.add(i);
            }
            
        }
        System.out.println(l1);
    }
    public static void main(String[] args) {
        factor(20);
    }
    
}
