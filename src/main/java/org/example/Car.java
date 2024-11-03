package org.example;

public class Car {

    Integer wheels;
    String carName;

    public Car(Integer wheels, String carName) {
        this.wheels = wheels;
        this.carName = carName;
    }

    public Car(String carName) {
        this.carName = carName;
    }

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
