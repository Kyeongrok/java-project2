package com.example.javaproject2.codeup;


import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1036 {
    public static void main(String[] args) throws IOException {
        // Ascii
        InputStreamReader isr = new InputStreamReader(System.in);
        System.out.printf("%s", isr.read());
    }
}
