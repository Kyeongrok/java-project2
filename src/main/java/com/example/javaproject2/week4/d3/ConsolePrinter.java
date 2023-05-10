package com.example.javaproject2.week4.d3;

public class ConsolePrinter implements Printer2 {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
