package com.example.javaproject2.codeup.e1000;

import java.util.Scanner;
public class Codeup1097 {

    public static void printArr2(int[][] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[20][20];
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
//        printArr2(arr);

        int size = sc.nextInt();
        for (int j = 0; j < size; j++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            // 행 뒤집기
            for (int i = 1; i < 20; i++) {
                arr[x][i] = arr[x][i] == 0 ? 1 : 0;
            }

            // 열 뒤집기
            for (int i = 1; i < 20; i++) {
                arr[i][y] = arr[i][y] == 0 ? 1 : 0;
            }
        }
        printArr2(arr);
    }
}
