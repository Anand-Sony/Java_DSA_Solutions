// Spy no. is number where sum and products of its digit are equal
// sum of digit = product of digit
public class spy_no {

    static void spyNO(int num){
        int sum = 0, product = 1;
        while(num > 0){
            int rem = num % 10;
            sum += rem; // sum = sum+rem
            product *= rem;  // product = produc * rem
            num /= 10; // num = num/10
        }
        if(sum == product){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not a Spy Number");
        }
    }

    public static void main(String[] args) {
        
        spyNO(1235);
        spyNO(1124);

    }
    
}