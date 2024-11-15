public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new StandartCarBuilder();
        BobBuilder bob = new BobBuilder(builder);
        Car car = bob.createCar();

    }
}