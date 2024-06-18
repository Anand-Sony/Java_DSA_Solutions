public class prime {

    static void primeno(int num){
        int count=0;
        for(int i=2;i<=num;i++){
            if(num%i==0){
                count++;

            }
        }
        if (count==1) {
            System.out.println(num + " Prime number");
        }
        else{
            System.out.println(num + " Not a prime number");
        }
    }
    public static void main(String[] args) {
        // now we will print that no is prime or not from 1 to 8.
        for(int i=1 ; i<9 ; i++){
            primeno(i);
        }

    }
    
}
