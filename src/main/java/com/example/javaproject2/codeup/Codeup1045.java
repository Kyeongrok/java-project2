package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        System.out.printf("%d\n", val1 + val2);
        System.out.printf("%d\n", val1 - val2);
        System.out.printf("%d\n", val1 * val2);
        System.out.printf("%d\n", val1 / val2);
        System.out.printf("%d\n", val1 % val2);
        System.out.printf("%.2f\n", val1 * 1.0 / val2 * 1.0);
    }
}
