import java.util.ArrayList;

public class count_0 {

    static void element(int n){
        int count=0;
        ArrayList<Integer> l1 = new ArrayList<>();
        while (n>0) {
            int rem = n%10;
            l1.add(rem);
            n=n/10;
        }
        System.out.println(l1);

        for(int i=0 ; i<l1.size() ; i++){
            if(l1.get(i)==0){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int n = 10501;
        element(n);
    }
    
}
