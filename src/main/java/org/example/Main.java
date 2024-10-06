package org.example;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setNumber(34534345);
        //System.out.println(phone.reciveCall("Slavic"));
        System.out.println(phone.reciveCall(phone.setName("werner"),phone.getNumber() ));

        System.out.println(phone.model);

        phone.send(7788);

    }
    }
