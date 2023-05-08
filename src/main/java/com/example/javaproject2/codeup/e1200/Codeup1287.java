package com.example.javaproject2.codeup.e1200;

import java.util.Scanner;
public class Codeup1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = 2;
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < 2 * i; j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }


    }
}
