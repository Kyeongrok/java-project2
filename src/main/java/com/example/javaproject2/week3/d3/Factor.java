package com.example.javaproject2.week3.d3;

public class Factor {
    public static void main(String[] args) {
        int num = 7;
        for (int i = 1; i <= num; i++) {
            System.out.printf("%d %% %d --> %d\n", num, i, num % i);
        }
    }
}
