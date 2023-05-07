package com.example.javaproject2.codeup.e1000;

import java.util.Arrays;
import java.util.Scanner;
public class Codeup1099 {
    public static void printArr(int[][] arr) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("-------------");
    }

    public static void printArr2(int[][] arr) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println("");
        }
    }
    public static String[][] arrFromScanner() {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[10][10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextLine().split(" ");
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력받은 지도를 배열에 입력 10 * 10
        int[][] arr = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 이동하고 찍을지
        // 이동 하면서 찍을지
        // 지금이 0이 아니고 다음이 1이 아니어야함
        int x = 1;
        int y = 1;
        int cnt = 0;
        while (cnt < 100){
            if(arr[y][x] == 2){
                arr[y][x] = 9;
                break;
            } else if (x < 9 && arr[y][x] == 0 && arr[y][x+1] != 1) {
                arr[y][x++] = 9;
            } else if(y < 9 && arr[y][x] == 0 && arr[y][x+1] == 1) {
                arr[y++][x] = 9;
            }
        }
        printArr2(arr);
    }
}
