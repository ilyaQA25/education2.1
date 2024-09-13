package org.example;

public enum Seasons {
    WINTER(new int[]{12,1,2}),
    SUMMER(new int[]{6,7,8}),
    FALL(new int[]{9,10,11}),
    SPRING(new int[]{3,4,5});

    public final int[] month;

    public int[] getMonth() {
        return month;
    }

    Seasons(int[] month) {
        this.month = month;
    }

    public static Seasons fromMonth(int months){
        for (Seasons value : Seasons.values()) {
            for (int month : value.getMonth()) {
                if (month == months){
                    return value;
                }
            }
            
        }
        return null;
    }
}
