package com.example.javaproject2.week4.d1;

public class RightTriangleStar {
    public static void main(String[] args) {
        int height = 5;
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.printf("0");
            }
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
