package com.example.javaproject2.week4.d1;

public class DimondStar2 {
    public static void main(String[] args) {
        int height = 7;
        for (int i = 0; i < height; i++) {
            if (i <= height / 2) { // 7 / 2 = 3
                System.out.println("0".repeat(height / 2 - i) + "*".repeat(2 * i + 1));
            } else {
                System.out.println("0".repeat(i - (height / 2)) + "*".repeat(2 * (height - i) - 1));
            }

        }
    }
}
