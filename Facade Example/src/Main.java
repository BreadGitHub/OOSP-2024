public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("42");
        BankAccount account2 = new BankAccount("24");
        BankFacade service = new BankFacade(account);

        service.deposit(1000);
        System.out.println("balance: " + service.getBalance());
        service.transfer(account2, 500);

    }
}