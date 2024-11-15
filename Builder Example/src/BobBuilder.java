public class BobBuilder {
    private  CarBuilder builder;

    public BobBuilder(CarBuilder builder) {
        super();
        this.builder = builder;
    }

    public Car createCar() {
        return builder.fixModel().fixColor().fixBrand().fixCarName().build();
    }
}
