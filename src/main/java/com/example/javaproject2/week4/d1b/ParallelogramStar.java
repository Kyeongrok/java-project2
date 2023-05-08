package com.example.javaproject2.week4.d1b;

public class ParallelogramStar {
    public static void main(String[] args) {
        int height = 5;
        for (int i = 0; i < height; i++) {
            for (int j = 1; j < height - i; j++) {
                System.out.printf("0");
            }
            System.out.println("*".repeat(height));
        }
    }
}
