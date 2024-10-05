package org.example;

public class Phone {
    Integer number;
    Integer weight;
    String model;

    String name;

    public Phone(Integer number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(Integer number, Integer weight, String model) {
        this(number,model);
        this.weight = weight;
    }

    public Phone() {
    }

    public Integer getNumber() {
        return number;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String reciveCall(String name){
        return name+ " is calling";
    }
    public String reciveCall(String name, Integer number){
        return  name+ " is calling. his number is: "+number;
    }

}
