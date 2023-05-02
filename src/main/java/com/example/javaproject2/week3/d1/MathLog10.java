package com.example.javaproject2.week3.d1;

public class MathLog10 {
    public static void main(String[] args) {
        double d = Math.log10(222);
        System.out.println(d);
        double d2 = Math.floor(d);
        System.out.println(d2);
        int digits = (int) (Math.floor(Math.log10(222)) + 1);
        System.out.println(digits);
    }
}
