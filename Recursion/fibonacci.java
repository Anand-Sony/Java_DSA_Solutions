public class fibonacci {

    static int fibo(int n){
        if (n<2) {
            return n;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
    public static void main(String[] args) {
        int ans = fibo(8);
        System.out.println(ans);
    }
}
