package org.example;

public interface Printable<T, U, R> {
    void printT(T t);
    void printU(U u);
}

abstract class PrintableDir<T> implements Printable<PrintableDir, PrintableDir, PrintableDir> {
    @Override
    public void printT(PrintableDir printableDir) {

    }

    @Override
    public void printU(PrintableDir printableDir) {

    }
}



abstract class Test<T,B, E> implements Printable<Test, Test, Test>{
    @Override
    public void printT(Test test) {

    }

    @Override
    public void printU(Test test) {

    }
    //запись Test<T,B, E> позволяет добавить еще 3 типа переменных: T,B, E
}

//пример generic