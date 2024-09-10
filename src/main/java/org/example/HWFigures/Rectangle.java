package org.example.HWFigures;

public class Rectangle extends Figure{
    Integer sideA;
    Integer sideB;

    public Rectangle(Integer sideA, Integer sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Integer getSideA() {
        return sideA;
    }

    public Integer getSideB() {
        return sideB;
    }

    @Override
    public Integer getPerim() {
        Integer rectPerim = sideA+sideB;
        return rectPerim;
    }

    @Override
    public Double getSqare() {
        Double rectSqare = (double) sideA*sideB;
        return rectSqare;
    }
}
