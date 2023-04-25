package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1031 {
    public static void main(String[] args) {
        // 10진수 -> 8진수
        Scanner sc = new Scanner(System.in);
        int iDecimal = sc.nextInt();
        String octal = Integer.toOctalString(iDecimal);
        System.out.println(octal);
//        System.out.printf("10진수 %d를 8진수로 표현하면 %s", iDecimal, octal);
        // ex 10 --> 12

    }
}
