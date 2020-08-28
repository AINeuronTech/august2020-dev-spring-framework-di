package aint.electronics;

public class ModernCalculator implements Count{
    private Device device;
    public ModernCalculator(){}
    public ModernCalculator(Device device){
        this.device = device;
    }
    public void setDevice(Device device){
        this.device = device;
    }
    public void computingPower() {
        int ram = device.getDeviceRamSize()+ 16;
        System.out.println("computing power: " + ram + " "+ device.getDeviceMonitorSize());
    }
}
