package com.example.javaproject2.codeup.e1000;

import java.util.Scanner;

public class Codeup1086 {
    public static void printToMb(long bit, String digit) {
        float result = bit / 1024.0f / 1024.0f / 8.0f;
        System.out.printf("%."+digit+"f MB\n", result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long h, b, c;
        h = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();

        long bit = h * b * c;
        printToMb(bit, "2");

    }
}
