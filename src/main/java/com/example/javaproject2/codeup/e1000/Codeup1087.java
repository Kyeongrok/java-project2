package com.example.javaproject2.codeup.e1000;

import java.util.Scanner;
public class Codeup1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = 0;

        for (int i = 1; answer < num; i++) {
            answer += i;
        }
        System.out.println(answer);
    }
}
