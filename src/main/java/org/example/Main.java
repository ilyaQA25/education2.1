package org.example;

import org.example.HWFigures.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(1,2);
        Rectangle rectangle2 = new Rectangle(2,3);
        Rectangle rectangle3 = new Rectangle(3,4);
        Rectangle rectangle4 = new Rectangle(5,6);
        Rectangle rectangle5 = new Rectangle(5,6);
        Rectangle[] arrRect = new Rectangle[]{rectangle1,rectangle2,rectangle3,rectangle4};
        for (int i = 0; i < arrRect.length; i++) {
            System.out.println(arrRect[i].getPerim());

        }
    }
}