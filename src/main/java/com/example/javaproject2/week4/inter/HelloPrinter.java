package com.example.javaproject2.week4.inter;

import java.io.IOException;

public class HelloPrinter {

    Printer printer;

    public HelloPrinter(Printer printer) {
        this.printer = printer;
    }

    public void repeatPrint(int n, String message) throws IOException {
        for (int i = 0; i < n; i++) {
            printer.print(message);
        }
    }

    public static void main(String[] args) throws IOException {
        HelloPrinter hp = new HelloPrinter(new FilePrinter());
        hp.repeatPrint(5, "Bye");
    }
}
