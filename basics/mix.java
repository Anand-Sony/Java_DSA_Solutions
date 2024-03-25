import java.util.Scanner;

public class mix {

    public static int factorial(int a){
        if (a==0 || a==1) {
            return 1;
        }
        else{
            return a * factorial(a-1);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. = ");
        int a = sc.nextInt();

        System.out.println("Factorial of the number"+a+ " is : "+factorial(a));


    }    

}
