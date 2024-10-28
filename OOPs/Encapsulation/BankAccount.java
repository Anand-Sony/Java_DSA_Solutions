public class BankAccount {

    private String accountNumber;
    private double balanceAvailable;

    // constructor :
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balanceAvailable = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balanceAvailable;
    }

    public boolean withdraw(double amount) {
        if (balanceAvailable >= amount) {
            balanceAvailable = balanceAvailable - amount;
            return true;
        }
        System.out.println("Balance is not enough");
        return false;
    }

}