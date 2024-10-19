package org.example;

public class NegativeNumberExeption extends RuntimeException{


    public NegativeNumberExeption() {
        super("negative results");
    }

    public void negativeResultMethod(int a, int b){
        if(a<0 || b<0){
            throw new NegativeNumberExeption();
        } else if (a>0 || b>0) {
            System.out.println("result of a/b is "+a/b);
        }

    }
}
