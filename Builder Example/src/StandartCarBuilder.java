public class StandartCarBuilder implements CarBuilder {

    private String model;
    private String color;
    private String carName;
    private String brand;

    public StandartCarBuilder() {
        super();
    }
    @Override
    public CarBuilder fixModel() {
        this.model = "standard car model";
        System.out.println("Set model to car: " + this.model);

        return this;
    }

    @Override
    public CarBuilder fixColor() {
        this.color = "standard car color";
        System.out.println("Set color to car: " + this.color);

        return this;
    }

    @Override
    public CarBuilder fixCarName() {
        this.carName = "standard car name";
        System.out.println("Set name to car: " + this.carName);

        return this;
    }

    @Override
    public CarBuilder fixBrand() {
        this.brand = "standard car brand";
        System.out.println("Set brand to car: " + this.brand);
        return this;
    }

    @Override
    public Car build() {
        return new Car(model, color, carName, brand);
    }
}
