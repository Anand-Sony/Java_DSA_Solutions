public class prime_no {

    static boolean isprime(int n ){
        if(n<=1){
            return false;
        }

        for (int j = 2; j <= n/2; j++) {
            if (n%j==0) {
                return false;
            }
        }
        return true;

    }
    
    public static void main(String[] args) {
        int n=20;
        for (int i = 1; i < n; i++) {
            System.out.println(i + " " + isprime(i));
        }
    }
}
