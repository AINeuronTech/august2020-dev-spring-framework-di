package aint.electronics;

import org.springframework.beans.factory.annotation.Autowired;

public class Calculator implements Count{

    private Device device;
    public Calculator(){}
    public Calculator(Device device){
        this.device = device;
    }

    @Autowired
    public void setDevice(Device device){
        this.device = device;
    }
    public void computingPower() {
      System.out.println("computing power: " + device.getDeviceRamSize()+ device.getDeviceMonitorSize());
    }
}
