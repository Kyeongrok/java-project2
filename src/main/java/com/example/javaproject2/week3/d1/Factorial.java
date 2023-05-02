package com.example.javaproject2.week3.d1;

public class Factorial {
    public static void main(String[] args) {
        int n = 5; // sc.nextInt()
        int answer = 1; // 0으로 하면 안됩니다.
        // +=, *=
        for (int i = n; i >= 1 ; i--) {
            answer *= i;
        }
        System.out.println(answer);
    }
}
