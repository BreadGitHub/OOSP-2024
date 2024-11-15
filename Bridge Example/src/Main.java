import Bridge.AbstractControl;
import Bridge.RemoteControl;
import Device.Device;
import Device.Robot;

public class Main {
    public static void main(String[] args) {
        Device robot = new Robot();

        AbstractControl controlRobot = new RemoteControl(robot);
        controlRobot.turnOn();
        controlRobot.doSomething();
        controlRobot.turnOff();
    }
}