package com.example.javaproject2.codeup.e1000;

import java.util.Scanner;
public class Codeup1082 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputVal = sc.next();
        int iHaxVal = Integer.parseInt(inputVal, 16);

        for (int i = 1; i <= 15; i++) {
            System.out.printf("%s*%X=%X\n", inputVal, i, iHaxVal * i);
        }
    }
}
