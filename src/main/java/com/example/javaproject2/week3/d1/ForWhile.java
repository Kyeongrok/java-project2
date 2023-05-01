package com.example.javaproject2.week3.d1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class ForWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        for (int i = 0; input1 != 0; i++) {
            System.out.println(input1);
            input1 = sc.nextInt();
        }
    }
}
