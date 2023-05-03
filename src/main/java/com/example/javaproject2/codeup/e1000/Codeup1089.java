package com.example.javaproject2.codeup.e1000;

import java.util.Scanner;
public class Codeup1089 {
    public static void main(String[] args) {
        // 등차수열의 n번째항
        // 1 3 5 초항, 등차, n번째 는 13
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int answer = (n - 1) * d + a;
        System.out.println(answer);
    }
}
