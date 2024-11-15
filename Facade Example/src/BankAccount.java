public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit: " + amount + " Now balance: " + getBalance());
        } else {
            System.out.println("Invalid value for deposit");
        }
    }

    public void transfer(BankAccount account, double amount) {
        System.out.println("amount: " + amount + "  balance: " + getBalance());
        if (amount <= getBalance()) {
            balance -= amount;
            account.deposit(amount);
            System.out.println("Transfer: " + amount + " account: " + account);
        } else {
            System.out.println("Invalid value for transfer");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
