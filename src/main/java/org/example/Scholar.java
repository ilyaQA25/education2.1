package org.example;

public class Scholar implements ScholarShedule{
    private DaysOfWeek dayOfWeek;
    private String name;
    private int grade;

    public Scholar(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public Scholar(DaysOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return "Scholar{" +
                "dayOfWeek=" + dayOfWeek +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public DaysOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DaysOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    @Override
    public void goToSchool() {

    }

    @Override
    public void goToSchool(DaysOfWeek daysOfWeek) {
        if (daysOfWeek==DaysOfWeek.SUNDAY || daysOfWeek==DaysOfWeek.SATURDAY){
            System.out.println(name +" doesn't need to go to school bc it is weekend");
        }else {
            System.out.println(name + " ,you need to go to scholl baby");
        }
    }
}
