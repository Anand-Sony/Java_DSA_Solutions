public class sum_digits {

    static int sumD(int n){
        int sum = 0;
        while (n>0) {
            sum = sum + n%10;
            n=n/10;
        }
        return sum;
    }


    static int  sumd(int n){
        if (n==0) {
            return 0;
        }
        else{
            return n%10 + sumd(n/10);
        }
    }
    public static void main(String[] args) {
        int n=123;
        System.out.println(sumD(n));
        System.out.println(sumd(n));
    }
    
}
