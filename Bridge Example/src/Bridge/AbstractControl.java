package Bridge;

import Device.Device;

public abstract class AbstractControl {
    protected Device device; //Device interface

    protected AbstractControl(Device device) {
        this.device = device;
    }

    public abstract void turnOn(); //uses
    public abstract void turnOff();
    public abstract void doSomething();
}
