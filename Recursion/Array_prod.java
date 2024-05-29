import java.util.ArrayList;
// in this we will caclculate the product of digit of the numbers,
public class Array_prod {

    static void prod(int n){
        ArrayList<Integer> l1 = new ArrayList<>();
        while (n>0) {
            int rem = n%10;
            l1.add(rem);
            n=n/10;
        }
        System.out.println(l1);;
        int product = 1;
        for (int i = 0; i < l1.size(); i++) {
            product =product* l1.get(i);
        }
        System.out.println("Product of the digit of the number is : "+product);
    }
    public static void main(String[] args) {
        int n=585;
        prod(n);

    }
    
}
