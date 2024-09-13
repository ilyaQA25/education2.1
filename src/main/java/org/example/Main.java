package org.example;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int month = 5;


        Seasons seasons = Seasons.fromMonth(month);

        if(seasons == Seasons.WINTER){
            System.out.println("Winter");
        } else if (seasons == Seasons.FALL) {
            System.out.println("Fall");
        } else if (seasons ==Seasons.SPRING) {
            System.out.println("spring");
        } else if (seasons ==Seasons.SUMMER) {
            System.out.println("summer");
        }
    }
    }
