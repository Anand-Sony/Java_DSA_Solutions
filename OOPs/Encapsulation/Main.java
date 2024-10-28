public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("123", 50000);
        System.out.println("Balance : " + ba.getBalance());

        ba.withdraw(20000);
        System.out.println("Balance after withdraw" + " is : " + ba.getBalance());
    }
}
