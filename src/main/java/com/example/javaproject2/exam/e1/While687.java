package com.example.javaproject2.exam.e1;

public class While687 {
    public static void main(String[] args) {
        int n = 687;
        int answer = 0;

        while (n > 0) {
            n = n / 10;
            answer += n % 10;
        }

        System.out.println(answer);
    }
}
