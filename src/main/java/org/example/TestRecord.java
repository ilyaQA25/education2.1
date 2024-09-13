package org.example;

public record TestRecord(Integer age, String name, Integer salary, Integer bonus)
        implements OverallIncome{

     static final String jobTitle = "QA";

    //переписаан метод из интерфеса
    @Override
    public Integer OverallIncome() {
       return salary+bonus;
    }

    //создан доп конструктор шоб не обязательно создавать оъект со всеми полями
    public TestRecord(Integer salary, Integer bonus) {
        this(0, "", salary, bonus);
    }
}
