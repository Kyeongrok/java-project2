package com.example.javaproject2.week4.d1;

public class DimondStar {
    public static void main(String[] args) {
        int height = 7;
        int pivot = height / 2;
        for (int i = 0; i < height; i++) {
            if (i <= height / 2) { // 7 / 2 = 3
                for (int j = 0; j < pivot - i; j++) System.out.printf("0");
                for (int j = 0; j < 2 * i + 1; j++) System.out.printf("*");
                System.out.println("");
            } else {
                // height = 4
                for (int j = 0; j < i - pivot; j++) System.out.printf("0");
                for (int j = 0; j < 2 * (height - i) - 1; j++) System.out.printf("*");
                System.out.println("");
            }
        }
    }
}
