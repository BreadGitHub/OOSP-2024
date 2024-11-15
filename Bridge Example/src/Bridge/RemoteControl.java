package Bridge;

import Device.Device;

public class RemoteControl extends AbstractControl {

    public RemoteControl(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    @Override
    public void doSomething() {
        device.doSomething();
    }
}
