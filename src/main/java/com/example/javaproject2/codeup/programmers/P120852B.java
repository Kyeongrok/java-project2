package com.example.javaproject2.codeup.programmers;

import java.util.Arrays;

public class P120852B {
    public static void main(String[] args) {
        int n = 12;
        int divisor = 2;
        int[] arr = new int[n + 1]; // 12개나 만들어야하나?

        while(n > 1){
            if (n % divisor == 0) { // 나누어 떨어지는지?
                arr[divisor] = divisor;
                n /= divisor;
            } else {
                // 12 --> 6 --> 3 인경우 2로 안나누어떨어짐
                divisor++;
            }
        }

        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                size++;
            }
        }
        int[] answer = new int[size];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                answer[idx++] = arr[i];
            }
        }

        for (int i = 0; i < answer.length; i++) System.out.printf("%d ", answer[i]);
    }
}
