package aint.electronics;

public class Car {

    private String model;
    private String year;
    public Car(){}
    public Car(String model){
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void carModel(String model){
        this.model = model;
    }
}
