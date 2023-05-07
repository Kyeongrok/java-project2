package com.example.javaproject2.codeup.e1000;

import java.util.Scanner;
public class Codeup1095 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int minValue = sc.nextInt();
        for (int i = 1; i < size; i++) {
            int now = sc.nextInt();
            if(minValue > now) minValue = now;
        }

        System.out.println(minValue);
    }
}
