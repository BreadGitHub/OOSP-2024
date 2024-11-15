public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock ("Stockname", 150.00);
        Investor investor1 = new Investor("Bob");
        stock.register(investor1);
        stock.setPrice(180.00);

        stock.remove(investor1);


    }
}