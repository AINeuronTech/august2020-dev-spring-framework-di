package aint.electronics;

public class Computer {
    private String processorBrand;
    private int processorCapacity;
    public Computer(){}
    public Computer(String processorBrand){
        this.processorBrand = processorBrand;
    }
    public Computer(int processorCapacity){
        this.processorCapacity = processorCapacity;
    }
    public Computer(String processorBrand, int processorCapacity){
        this.processorBrand = processorBrand;
        this.processorCapacity = processorCapacity;
    }
    public void computerBrandConfig(){
        System.out.println("Config of Computer: "+ processorBrand);
    }
    public void computerCapacityConfig(){
        System.out.println("Config of Computer: "+ processorCapacity);
    }
    public void computerProcessorBrandNCapacityConfig(){
        System.out.println("Config of Computer: "+ processorBrand+ " Processor Capacity: "+ processorCapacity);
    }
}
