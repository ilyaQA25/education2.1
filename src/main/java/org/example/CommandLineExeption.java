package org.example;

public class CommandLineExeption extends Exception{
    public CommandLineExeption(String exeption) {
        super("wrong command"+exeption);
    }
}
