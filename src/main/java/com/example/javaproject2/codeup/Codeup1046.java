package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();
        int sum = val1 + val2 + val3;
        float average = (float)(val1 + val2 + val3) / 3.0f;
        System.out.println(sum);
        System.out.printf("%.1f", average);
    }
}
