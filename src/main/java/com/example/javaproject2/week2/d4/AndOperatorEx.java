package com.example.javaproject2.week2.d4;

public class AndOperatorEx {
    public static void main(String[] args) {
        System.out.printf("%b %b --> %b\n", true, true, true && true);
        System.out.printf("%b %b --> %b\n", true, false, true && false);
        System.out.printf("%b %b --> %b\n", false, true, false && true);
        System.out.printf("%b %b --> %b\n", false, false, false && false);
    }
}
