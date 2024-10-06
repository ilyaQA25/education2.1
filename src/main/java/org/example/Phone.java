package org.example;

public class Phone implements CodeSender{
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

    public int setNumber(Integer number) {
        this.number = number;
        return 0;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String setModel(String model) {
        this.model = model;
        return model;
    }


    public String reciveCall(String name){
        return name+ " is calling";
    }
    public String reciveCall(String name, Integer number){
        return  name+ " is calling. his number is: "+number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void send(Integer code) {
        System.out.println(code+" is sended to number: " + number);
    }
}
