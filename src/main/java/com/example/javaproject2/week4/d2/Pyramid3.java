package com.example.javaproject2.week4.d2;

public class Pyramid3 {
    public static int height = 4;

    public static String makeALine(int h, int i) {
        return String.format("%s%s\n", "0".repeat(i), "*".repeat(h - i));
    }

    public static void main(String[] args) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }
}
