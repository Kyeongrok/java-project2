package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String koreanId = "871119-1234567";
        koreanId = sc.nextLine();
        String date = koreanId.substring(0, 6);
        String code = koreanId.substring(7);
        System.out.printf("%s%s", date, code);
    }
}
