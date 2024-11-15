interface CarBuilder {
    public CarBuilder fixModel();
    public CarBuilder fixColor();
    public CarBuilder fixCarName();
    public CarBuilder fixBrand();
    public Car build();
}