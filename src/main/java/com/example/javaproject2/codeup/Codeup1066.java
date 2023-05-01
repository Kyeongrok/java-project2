package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1066 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();
        System.out.println(val1 % 2 == 0 ? "even" : "odd");
        System.out.println(val2 % 2 == 0 ? "even" : "odd");
        System.out.println(val3 % 2 == 0 ? "even" : "odd");
    }
}
