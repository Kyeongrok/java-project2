package com.example.javaproject2.week4.inter;

public class ConsolePrinter implements Printer{
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
