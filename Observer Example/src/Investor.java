public class Investor implements Observer {
    private String name;
    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stock, double price) {
        System.out.println("Investor: " + name + "\n notify: " + stock + "\n price changed: " + price);
    }
}
