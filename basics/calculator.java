import java.util.*;
public class calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double ans =0;
         while (true) {
            System.out.print("Enter the operator : ");
            
            char c = sc.next().trim().charAt(0);
            System.out.println("You choose the "+c+" Operator ");

            if (c=='+' || c=='-' || c=='*' || c=='/' ) {

                System.out.print("enter the first no. = ");
                double a = sc.nextInt();
                System.out.print("enter the Second no. = ");
                double b = sc.nextInt();

                if (c=='+') {
                    ans = a+b;
                    System.out.print("Addition of the number is : "+ans);
                }
                if (c=='-') {
                    ans = a-b;
                    System.out.print("Substraction of the number is : "+ans);
                }
                if (c=='*') {
                    ans = a*b;
                    System.out.print("Multiplication of the number is : "+ans);
                }
                if (c=='/') {
                    ans = a/b;
                    System.out.println("Division of the number is : "+ans);
                    System.out.println();
                }

                
            }
            System.out.println();
            
         }

    }

}
