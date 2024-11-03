package org.example;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //пример generic
        // generic used for storage different type of date
        //class Car created for reminder why we need getters,setters and cunstructors and how this is working

        Cell<String> stringCell = new Cell<>("dsf");
        stringCell.getT();

        Cell<Integer> stringCell2 = new Cell(4);
        stringCell2.getT();




/*

        Car car = new Car(4,"wqerq");
        Car car2 = new Car("lols");
        car.getCarName();
        car2.setWheels(6);
*/

    }
    }
class  Cell<T>{
    public Cell(T t) {
        this.t = t;
    }

    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
