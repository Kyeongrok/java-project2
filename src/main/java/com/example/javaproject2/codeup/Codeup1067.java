package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1067 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        System.out.println(val1 > 0 ? "plus" : "minus");
        System.out.println(val1 % 2 == 0 ? "even" : "odd");
    }
}
