package com.example.javaproject2.week2.d4;

public class Accumulate687Compund {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;

        // 1 나머지 2 몫
        answer += num % 10;
        num /= 10;
        answer += num % 10;
        num /= 10;
        answer += num % 10;
        num /= 10;
        System.out.println(answer);
    }
}
