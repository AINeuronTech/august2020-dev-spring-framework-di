package aint.electronics;

public class Toyota {

    Car carModelType;
    Car carMakeYear;

    public Toyota(){}
    public Toyota(Car carModelType){
        this.carModelType = carModelType;
    }
    public Toyota(Car carModelType, Car carMakeYear){
        this.carModelType = carModelType;
        this.carMakeYear = carMakeYear;
    }

    public void setCarMakeYear(Car carMakeYear) {
        this.carMakeYear = carMakeYear;
    }

    public void setCarModelType(Car carModelType){
        this.carModelType = carModelType;
    }
    public void driveCar(){
        System.out.println("Driving the Car Model:" + carModelType.getModel()+ " "+carMakeYear.getYear());
    }
}
