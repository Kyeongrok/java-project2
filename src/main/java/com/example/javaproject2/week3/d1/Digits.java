package com.example.javaproject2.week3.d1;

public class Digits {
    public static void main(String[] args) {
        int num = 45634;
        // 자릿수 만큼 반복

        int digits = 0;
        while (num > 0) {
            num = num / 10;
            digits++;
        }
        System.out.println(digits);


    }
}
