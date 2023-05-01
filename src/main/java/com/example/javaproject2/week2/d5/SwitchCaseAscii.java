package com.example.javaproject2.week2.d5;

import java.io.InputStreamReader;
import java.util.Scanner;
public class SwitchCaseAscii {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);

        switch (c) {
            case 'A':
                System.out.println("best!!!");
                break;
            case 'B':
                System.out.println("good!!");
                break;
        }
    }
}
