package org.example;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NegativeNumberExeption negativeNumberExeption = new NegativeNumberExeption();

        try {
            negativeNumberExeption.negativeResultMethod(25,5);
        }catch (NegativeNumberExeption negativeNumberExeption1){
            System.out.println("one of the numbers is negative");
        }

    }
    }
