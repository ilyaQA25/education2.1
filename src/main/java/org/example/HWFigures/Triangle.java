package org.example.HWFigures;

public class Triangle extends Figure{
    Integer sideA;
    Integer sideB;
    Integer sideC;
    ;

    public Integer getSideA() {
        return sideA;
    }

    public Integer getSideB() {
        return sideB;
    }

    public Integer getSideC() {
        return sideC;
    }

    public Triangle(Integer sideA, Integer sideB, Integer sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Integer getRectPerim() {
        Integer rectPerim = sideA+sideB+sideC;
        return rectPerim;
    }

    @Override
    public Integer getPerim() {
        Integer rectPerim = sideA+sideB+sideC;
        return rectPerim;
    }

    @Override
    public Double getSqare() {
        return super.getSqare();
    }
}
