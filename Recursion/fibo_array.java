import java.util.ArrayList;

public class fibo_array {
    
    static int fibo(int n){
        if (n<=1) {
            return n;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }


    public static void main(String[] args) {
        
        ArrayList <Integer> l1 = new ArrayList<>();

        int n =5;
        for (int i = 0; i < n; i++) {
            fibo(i);
            l1.add(fibo(i));
        }
        System.out.println(l1);
    }
}
