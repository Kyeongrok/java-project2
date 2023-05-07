package com.example.javaproject2.codeup.e1000;

import java.util.Scanner;
public class Codeup1096 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int[][] arr = new int[20][20];

        for (int i = 0; i < input; i++) {
            int xLocation = sc.nextInt();
            int yLocation = sc.nextInt();
            arr[xLocation][yLocation] = 1;
        }

        for (int i = 1; i <= 19; i++) {
            for (int j = 1; j <= 19; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println("");
        }
    }
}
