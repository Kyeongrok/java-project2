package com.example.javaproject2.week2.d2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerWithDelimiter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(Pattern.compile("[.:]"));
    }
}
