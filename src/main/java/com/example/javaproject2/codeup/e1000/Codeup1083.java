package com.example.javaproject2.codeup.e1000;

import java.util.Scanner;
public class Codeup1083 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i % 3 != 0){
                System.out.printf("%d ", i);
            } else {
                System.out.printf("%s ", "X");
            }
        }
    }
}
