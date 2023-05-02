package com.example.javaproject2.codeup.e1000;

import java.util.Scanner;
public class Codeup1085 {

    public static void printToMb(long bit) {
        float result = bit / 1024.0f / 1024.0f / 8.0f;
        System.out.printf("%.1f MB\n", result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long h, b, c, s;
        h = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        s = sc.nextLong();
        long bit = h * b * c * s; // bit
        printToMb(bit);
    }
}
