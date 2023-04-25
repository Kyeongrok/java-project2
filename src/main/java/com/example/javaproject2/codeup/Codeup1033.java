package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1033 {
    public static void main(String[] args) {
        // 10진수 -> 8진수
        Scanner sc = new Scanner(System.in);
        int iDecimal = sc.nextInt();
        String hexadecimal = Integer.toHexString(iDecimal);
        System.out.println(hexadecimal.toUpperCase());
    }
}
