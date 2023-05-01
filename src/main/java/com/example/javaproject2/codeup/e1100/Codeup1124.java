package com.example.javaproject2.codeup.e1100;

import java.util.Scanner;

public class Codeup1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sNums = sc.nextLine().replace("C", "").split("H");
        System.out.printf("%d\n", Integer.parseInt(sNums[0]) * 12 + Integer.parseInt(sNums[1]) );
    }
}
