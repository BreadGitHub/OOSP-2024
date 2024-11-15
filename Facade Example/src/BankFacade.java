class BankFacade {
    private BankAccount account;

    BankFacade(BankAccount account) {
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void transfer(BankAccount account, double amount) {
        account.transfer(account, amount);
    }

    public double getBalance() {
        return account.getBalance();
    }

    
}