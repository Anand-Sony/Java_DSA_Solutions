import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int x = -5;
        int y = 1;
        Double z = 11.0;

        System.out.println(Math.max(x, y));
        System.out.println(Math.sqrt(x));
        System.out.println(Math.sqrt(y));

        System.out.printf("Square root of " + z + " round off to 2(decimal) = " + " %.2f", Math.sqrt(z));
        // we can also use Math.round :
        System.out.println();
        z = 4.587;
        System.out.println(Math.round(z));

        // now lets use random:
        double r = Math.random(); // this will take value from 0 to 1 :
        System.out.println(r);

        // now use random for taking more than the 1 value :
        Random r2 = new Random();
        System.out.println(r2.nextDouble(10));
        // r2.nextDouble() will take value from 0 to 10 :

        System.out.println(r2.nextDouble(10) + 1);
        // r2.nextDouble() will take value from 1 to 10 :

    }
}