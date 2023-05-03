package com.example.javaproject2.week3.d3;

import java.util.Scanner;
import java.util.Stack;

public class IsPrimeRoot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factors = 0; // 약수의 개수
        for (int i = 2; i * i <= num; i++) { // 1 ~ 6까지
            if(num % i == 0) factors++;
        } // factors = 1
//        System.out.printf("factors:%d\n", factors);
        System.out.println(factors == 0 ? "prime": "not prime");

        Stack<Integer> st = new Stack<>();
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            for (int j = 0; j < 10; j++) {
                st.push(i);
            }
        }


    }
}
