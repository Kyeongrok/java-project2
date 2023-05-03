package com.example.javaproject2.codeup.e1000;

import java.util.Scanner;

public class Codeup1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        long answer = a;
        for (int i = 0; i < n - 1; i++) {
            answer *= r;
        }
        System.out.println(answer);
    }
}
