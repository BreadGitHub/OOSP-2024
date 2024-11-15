package Device;

public class AutonomousCar implements Device {
    @Override
    public void turnOn() {
        System.out.println("On");
    }

    @Override
    public void turnOff() {
        System.out.println("Off");

    }

    @Override
    public void doSomething() {
        System.out.println("do something");

    }
}
